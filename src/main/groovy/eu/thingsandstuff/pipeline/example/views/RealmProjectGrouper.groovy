package eu.thingsandstuff.pipeline.example.views

import eu.thingsandstuff.pipeline.example.MicroserviceProject

class RealmProjectGrouper implements ProjectGrouper {

    @Override
    List<List<MicroserviceProject>> groupProjects(List<MicroserviceProject> projects) {
        return projects.groupBy { it.realmDomainPart() }.values() as List
    }
}
