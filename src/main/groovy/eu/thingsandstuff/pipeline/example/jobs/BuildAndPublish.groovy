package eu.thingsandstuff.pipeline.example.jobs

import eu.thingsandstuff.pipeline.JenkinsVariables
import eu.thingsandstuff.pipeline.example.JobDslConfigureHacksUtil
import eu.thingsandstuff.pipeline.example.MicroserviceJobUtils
import eu.thingsandstuff.pipeline.example.MicroserviceProject
import javaposse.jobdsl.dsl.Job
import javaposse.jobdsl.dsl.helpers.step.StepContext

import static eu.thingsandstuff.pipeline.example.JenkinsVariable.APP_VERSION
import static eu.thingsandstuff.pipeline.example.JenkinsVariable.BUILD_DATETIME
import static eu.thingsandstuff.pipeline.example.JenkinsVariable.BUILD_DISPLAY_NAME
import static eu.thingsandstuff.pipeline.example.JenkinsVariable.GIT_COMMIT
import static eu.thingsandstuff.pipeline.example.JenkinsVariable.GIT_COMMIT_SHORT
import static eu.thingsandstuff.pipeline.example.JenkinsVariable.PIPELINE_VERSION
import static eu.thingsandstuff.pipeline.example.JenkinsVariable.SCM_POLLING_ENABLED

class BuildAndPublish extends MicroserviceJobDefinition {
    @Override
    void configure(Job job, MicroserviceProject project, JenkinsVariables jenkinsVariables) {
        job.with {
            setupEnvironmentVariables(job)
            configure JobDslConfigureHacksUtil.injectAndMaskPasswords()
            scm MicroserviceJobUtils.configureGit(project)
            if (project.gitConfig.cronToPoll && jenkinsVariables.getBoolean(SCM_POLLING_ENABLED, true)) {
                triggers {
                    scm(project.gitConfig.cronToPoll)
                }
            }
            addGradleBuildStep(job, project)
            //addArchiveJunitAsBuildStep(job)
            steps {
                ifBuildStillSuccessful(delegate as StepContext) {
                    gradle("publish --stacktrace ${projectVersionParameters()}")
                }
            }
        }
    }

    private setupEnvironmentVariables(Job job) {
        job.with {
            environmentVariables {
                groovy($/
                    String buildDateTime = new Date().format("yyyyMMdd-HHmmss")
                    return [
                        ${BUILD_DATETIME.name()}: buildDateTime,
                        ${PIPELINE_VERSION.name()}: "${BUILD_DISPLAY_NAME.reference} $${buildDateTime}",
                    ]
                /$.stripIndent())
            }
            def gitShortCommitFileName = 'jenkinsShortCommitHashHack.txt'
            steps {
                //TODO: Workaround for https://issues.jenkins-ci.org/browse/JENKINS-30042
                shell(/echo "${GIT_COMMIT_SHORT.name()}=`echo ${GIT_COMMIT.reference} | cut -c1-7`" > $gitShortCommitFileName/)
                environmentVariables {
                    propertiesFile(gitShortCommitFileName)
                    env(APP_VERSION.name(), "${BUILD_DATETIME.reference}-${GIT_COMMIT_SHORT.reference}")
                }
            }
        }
    }

    private addGradleBuildStep(Job job, MicroserviceProject project) {
        def initScriptName = 'adapt_gradle_build_for_microservice_pipeline.gradle'
        def initscript = getClass().getResource("/eu/thingsandstuff/pipeline/$initScriptName")
        job.with {
            steps {
                shell("cat > $initScriptName <<- EOF\n${initscript.text}\nEOF")
                gradle(
                        "clean build --init-script $initScriptName --continue --stacktrace --parallel " +
                                projectVersionParameters()
                )
            }
        }
    }

    private String projectVersionParameters() {
        /-Pproject.version=${APP_VERSION.reference} -PbuildNr=${APP_VERSION.reference}/
    }

    private void addArchiveJunitAsBuildStep(Job job) {
        job.with {
            steps {
                configure { project ->
                    project / 'builders' / 'org.jenkinsci.plugins.conditionalbuildstep.ConditionalBuilder' << {
                        runCondition(class: 'org.jenkins_ci.plugins.run_condition.core.AlwaysRun')
                        runner(class: 'org.jenkins_ci.plugins.run_condition.BuildStepRunner$Fail')
                        conditionalbuilders {
                            'hudson.tasks.junit.JUnitResultArchiver' {
                                testResults(DEFAULT_GRADLE_JUNIT_XML_REPORTS_PATH)
                                keepLongStdio('false')
                                testDataPublishers()
                            }
                        }
                    }
                }
            }
        }
    }

    private static void ifBuildStillSuccessful(StepContext context, @DelegatesTo(StepContext) Closure closure) {
        context.with {
            conditionalSteps {
                condition {
                    status('SUCCESS', 'SUCCESS')
                }
                runner('Fail')
                steps closure
            }
        }
    }
}
