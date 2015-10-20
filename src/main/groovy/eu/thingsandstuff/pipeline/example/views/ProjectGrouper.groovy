package eu.thingsandstuff.pipeline.example.views

import eu.thingsandstuff.pipeline.example.MicroserviceProject

interface ProjectGrouper {
    List<List<MicroserviceProject>> groupProjects(List<MicroserviceProject> projects)
}
