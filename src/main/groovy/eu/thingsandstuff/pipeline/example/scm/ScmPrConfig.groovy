package eu.thingsandstuff.pipeline.example.scm

class ScmPrConfig {

    enum TriggerMode {
        AUTO, PHRASE_IN_COMMENT

        boolean isOnDemand() {
            this == PHRASE_IN_COMMENT
        }
    }

    String cronToPollScm = "*/5 * * * *"
    TriggerMode triggerMode = TriggerMode.AUTO

    void withCronToPollScm(String cronToPollScm) {
        this.cronToPollScm = cronToPollScm
    }

    void withTriggerMode(TriggerMode triggerMode) {
        this.triggerMode = triggerMode
    }
}
