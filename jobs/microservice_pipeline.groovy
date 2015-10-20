import eu.thingsandstuff.pipeline.JenkinsVariables
import eu.thingsandstuff.pipeline.PipelineTemplateBuilder
import eu.thingsandstuff.pipeline.example.GitProjectFetcher
import eu.thingsandstuff.pipeline.example.MicroservicePipelineTemplate
import eu.thingsandstuff.pipeline.example.MicroserviceProject
import eu.thingsandstuff.pipeline.example.Nameable
import eu.thingsandstuff.pipeline.example.scm.GitHubConfig
import eu.thingsandstuff.pipeline.example.views.MicroserviceViewsBuilder
import javaposse.jobdsl.dsl.DslFactory

String organization = binding.variables['ORGANIZATION_NAME'] ?: 'uservices-hackathon'
def reposApi = new URL("https://api.github.com/orgs/${organization}/repos")
def repos = new GitProjectFetcher(binding.variables['OFFLINE_MODE'] ?: true, reposApi).fetchRepos()
def projectsToExclude =  ((binding.variables['PROJECTS_TO_EXCLUDE'] as String)?.split(',') as List) ?: ['github.io', 'properties', 'jenkins-pipeline-dsl-example']

List projectToCode = repos.findAll {!projectsToExclude.contains(it.name)}

List<MicroserviceProject> projects = projectToCode.collect {
        String name = it.name
        return new MicroserviceProject(name, 'pl', GitHubConfig.create({ name } as Nameable, organization))
}
projects.each {
        new PipelineTemplateBuilder(this as DslFactory, JenkinsVariables.from(this))
                .build(MicroservicePipelineTemplate.INSTANCE, it)
}
new MicroserviceViewsBuilder(this as DslFactory).build(projects)