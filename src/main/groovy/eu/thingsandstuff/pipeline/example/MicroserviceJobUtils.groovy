package eu.thingsandstuff.pipeline.example

abstract class MicroserviceJobUtils {

    static Closure configureGit(MicroserviceProject project, String gitRef = 'master') {
        return {
            git {
                remote {
                    name('origin')
                    url(project.gitConfig.repoUrl.toString())
                    credentials(project.gitConfig.credentialsId)
                    branch(gitRef)
                }
            }
        }
    }


}