import eu.thingsandstuff.pipeline.JenkinsVariables
import eu.thingsandstuff.pipeline.PipelineTemplateBuilder
import eu.thingsandstuff.pipeline.example.MicroservicePipelineTemplate
import eu.thingsandstuff.pipeline.example.MicroserviceProject
import javaposse.jobdsl.dsl.DslFactory

new PipelineTemplateBuilder(this as DslFactory, JenkinsVariables.from(this))
        .build(MicroservicePipelineTemplate.INSTANCE, new MicroserviceProject())