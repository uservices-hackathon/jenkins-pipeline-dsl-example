package eu.thingsandstuff.pipeline.example.jobs

import eu.thingsandstuff.pipeline.JenkinsVariables
import eu.thingsandstuff.pipeline.example.MicroserviceProject
import javaposse.jobdsl.dsl.Job

abstract class DummyJobDefinition extends MicroserviceJobDefinition {

    @Override
    void configure(Job job, MicroserviceProject microserviceProject, JenkinsVariables jenkinsVariables) {
        job.with {
            steps {
                shell(/echo "This is just a dummy placeholder for '${this.getJobLabel()}' job."/)
                shell(/echo "Bye!"/)
            }
        }
    }
}
