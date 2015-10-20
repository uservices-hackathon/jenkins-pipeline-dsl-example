package eu.thingsandstuff.pipeline.example.jobs

import eu.thingsandstuff.pipeline.example.ProjectVersion

class Jobs {
    public static BUILD_AND_PUBLISH = new BuildAndPublish()
    public static SMOKE_TEST_CURRENT_VERSION = new SmokeTest(ProjectVersion.CURRENT)
    public static FIND_PREVIOUS_PRODUCTION_VERSION = new FindPreviousProductionVersion()
    public static SMOKE_TEST_PREVIOUS_VERSION = new SmokeTest(ProjectVersion.PREVIOUS)
    public static NOTIFY_OF_PRODUCTION_DEPLOY = new NotifyOfProductionDeploy()
    public static DEPLOY_CURRENT_VERSION_TO_PRODUCTION = new DeployToProduction(ProjectVersion.CURRENT)
    public static TAG_RELEASE = new TagRelease()
    public static DEPLOY_PREVIOUS_VERSION_TO_PRODUCTION = new DeployToProduction(ProjectVersion.PREVIOUS)
}
