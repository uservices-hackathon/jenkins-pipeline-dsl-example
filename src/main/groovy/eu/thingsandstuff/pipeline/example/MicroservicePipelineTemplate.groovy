package eu.thingsandstuff.pipeline.example
import eu.thingsandstuff.pipeline.JobChain
import eu.thingsandstuff.pipeline.JobConfigurer
import eu.thingsandstuff.pipeline.PipelineBuilder
import eu.thingsandstuff.pipeline.PipelineTemplate
import eu.thingsandstuff.pipeline.StageNameConfigurer
import eu.thingsandstuff.pipeline.TriggerCondition
import eu.thingsandstuff.pipeline.link.CombinedJobChainLink

import static eu.thingsandstuff.pipeline.example.JenkinsVariable.APP_VERSION
import static eu.thingsandstuff.pipeline.example.JenkinsVariable.GIT_COMMIT
import static eu.thingsandstuff.pipeline.example.JenkinsVariable.PREV_APP_VERSION
import static eu.thingsandstuff.pipeline.example.jobs.Jobs.getBUILD_AND_PUBLISH
import static eu.thingsandstuff.pipeline.example.jobs.Jobs.getDEPLOY_CURRENT_VERSION_TO_PRODUCTION
import static eu.thingsandstuff.pipeline.example.jobs.Jobs.getDEPLOY_PREVIOUS_VERSION_TO_PRODUCTION
import static eu.thingsandstuff.pipeline.example.jobs.Jobs.getFIND_PREVIOUS_PRODUCTION_VERSION
import static eu.thingsandstuff.pipeline.example.jobs.Jobs.getNOTIFY_OF_PRODUCTION_DEPLOY
import static eu.thingsandstuff.pipeline.example.jobs.Jobs.getSMOKE_TEST_CURRENT_VERSION
import static eu.thingsandstuff.pipeline.example.jobs.Jobs.getSMOKE_TEST_PREVIOUS_VERSION
import static eu.thingsandstuff.pipeline.example.jobs.Jobs.getTAG_RELEASE
import static eu.thingsandstuff.pipeline.link.AutoLink.auto

class MicroservicePipelineTemplate implements PipelineTemplate<MicroserviceProject> {

    static final INSTANCE = new MicroservicePipelineTemplate()

    private MicroservicePipelineTemplate() {}

    @Override
    JobConfigurer<MicroserviceProject> createJobConfigurer() {
        return new MicroserviceJobConfigurer()
    }

    @Override
    StageNameConfigurer createStageNameConfigurer() {
        return new DeliveryPipelineStageNameConfigurer()
    }

    @Override
    void configurePipeline(PipelineBuilder<MicroserviceProject> pipelineBuilder, MicroserviceProject project) {
        pipelineBuilder.configure {
            stage('Build') {
                job BUILD_AND_PUBLISH
            }
            stage('Run smoke & rollback tests') {
                job SMOKE_TEST_CURRENT_VERSION
                job FIND_PREVIOUS_PRODUCTION_VERSION
                job SMOKE_TEST_PREVIOUS_VERSION
            }
            stage('Deploy to prod') {
                job NOTIFY_OF_PRODUCTION_DEPLOY
                job DEPLOY_CURRENT_VERSION_TO_PRODUCTION
                job TAG_RELEASE
            }
            stage('Automatic rollback') {
                job DEPLOY_PREVIOUS_VERSION_TO_PRODUCTION
            }

            chain(JobChain.of(BUILD_AND_PUBLISH)
                    .then(auto(SMOKE_TEST_CURRENT_VERSION)
                        .withPredefinedProperties(APP_VERSION, GIT_COMMIT)
                    )
                    .then(FIND_PREVIOUS_PRODUCTION_VERSION)
                    .then(auto(SMOKE_TEST_PREVIOUS_VERSION, TriggerCondition.UNSTABLE_OR_BETTER)
                        .withPredefinedProperties(PREV_APP_VERSION)
                    )
                    .then(auto(DEPLOY_CURRENT_VERSION_TO_PRODUCTION))
                    .then(CombinedJobChainLink.of(
                        auto(TAG_RELEASE, TriggerCondition.SUCCESS),
                        auto(DEPLOY_PREVIOUS_VERSION_TO_PRODUCTION, TriggerCondition.UNSTABLE_OR_WORSE)
                    ))
            )
        }
    }
}
