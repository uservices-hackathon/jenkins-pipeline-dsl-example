package eu.thingsandstuff.pipeline.example.scm

interface ScmConfig {
    URI getRepoUrl()
    String getCredentialsId()
    String getCronToPoll()

    //Only required for PR builds - remove if the plugin configuration is simplified
    ScmPrConfig getPrConfig()
    URI gitServerUrl()
    String getGroup()
    String getProjectName()
}