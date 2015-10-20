package eu.thingsandstuff.pipeline.example.jobs

import eu.thingsandstuff.pipeline.JenkinsVariables
import eu.thingsandstuff.pipeline.JobType
import eu.thingsandstuff.pipeline.example.MicroserviceProject
import eu.thingsandstuff.pipeline.example.ProjectVersion
import javaposse.jobdsl.dsl.Job

import static eu.thingsandstuff.pipeline.example.JenkinsVariable.APP_VERSION

class DeployToProduction extends MicroserviceJobDefinition {

    private final ProjectVersion projectVersion

    DeployToProduction(ProjectVersion projectVersion) {
        this.projectVersion = projectVersion
    }

    @Override
    JobType getJobType() {
        return new JobType(toJobTypeFromUpperUnderscore('DEPLOY_' + projectVersion.name() + '_TO_PRODUCTION'))
    }

    @Override
    void configure(Job job, MicroserviceProject project, JenkinsVariables jenkinsVariables) {
        job.with {
            publishers {
                rundeck('deploy:deploy') {
                    options([
                            artifactId: project.effectiveArtifactId,
                            groupId: project.groupId,
                            nexusUrl: 'http://nexus.uservices.pl:8081/nexus/content/repositories/releases/',
                            version: APP_VERSION.reference

                    ])
                    shouldFailTheBuild()
                    shouldWaitForRundeckJob()
                }
            }
        }
    }
}
