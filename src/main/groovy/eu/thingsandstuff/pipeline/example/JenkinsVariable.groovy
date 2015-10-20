package eu.thingsandstuff.pipeline.example

import eu.thingsandstuff.pipeline.JenkinsVariables
import eu.thingsandstuff.pipeline.Variable

enum JenkinsVariable implements Variable {

    APP_VERSION,
    PREV_APP_VERSION,
    GIT_COMMIT,
    BUILD_DATETIME,
    BUILD_DISPLAY_NAME,
    GIT_COMMIT_SHORT,
    PIPELINE_VERSION,
    BUILD_PHRASE,
    AUTOMATIC_PR_BUILDING_ENABLED,
    SCM_POLLING_ENABLED,
    MICROSERVICE_RELEASE_TAG_PREFIX,
    DEPLOY_ENV,
    BUILD_NUMBER,
    GIT_CHECKOUT_REF,
    ENV_IS_BUILD_SERVER_INSTANCE

    final String reference
    final String envReference

    JenkinsVariable() {
        this.reference = JenkinsVariables.reference(this)
        this.envReference = JenkinsVariables.envReference(this)
    }
}
