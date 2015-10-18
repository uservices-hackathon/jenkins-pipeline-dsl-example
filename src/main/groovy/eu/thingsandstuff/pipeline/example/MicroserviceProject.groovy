package eu.thingsandstuff.pipeline.example

import eu.thingsandstuff.pipeline.Project

class MicroserviceProject implements Project {

    @Override
    String getQualifiedName() {
        return 'boot-microservice'
    }
}
