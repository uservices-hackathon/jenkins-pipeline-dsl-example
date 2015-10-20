package eu.thingsandstuff.pipeline.example

import eu.thingsandstuff.pipeline.Project
import eu.thingsandstuff.pipeline.example.scm.ScmConfig

class MicroserviceProject implements Project {

    final String qualifiedName
    final String qualifiedProjectName
    final String realDomainPart
    final String nameWithProduct
    final ScmConfig gitConfig

    /**
     *
     * @param qualifiedName -
     * @param qualifiedProjectName - the name of the project in view e.g. "foo-bar-service"
     * @param realDomainPart - e.g. "pl"
     * @param nameWithProduct - the name of the project with product "product-foo-bar"
     */
    MicroserviceProject(String qualifiedName, String qualifiedProjectName, String realDomainPart, String nameWithProduct, ScmConfig scmConfig) {
        this.qualifiedName = qualifiedName
        this.qualifiedProjectName = qualifiedProjectName
        this.realDomainPart = realDomainPart
        this.nameWithProduct = nameWithProduct
        this.gitConfig = scmConfig
    }

    MicroserviceProject(String qualifiedProjectName, String realDomainPart, ScmConfig scmConfig) {
        this.qualifiedName = qualifiedProjectName
        this.qualifiedProjectName = qualifiedProjectName
        this.realDomainPart = realDomainPart
        this.nameWithProduct = qualifiedProjectName
        this.gitConfig = scmConfig
    }

    String getQualifiedProjectName() {
        return qualifiedProjectName
    }

    String realmDomainPart() {
        return realDomainPart
    }

    String nameWithProduct() {
        return nameWithProduct
    }

    @Override
    String getQualifiedName() {
        return qualifiedName
    }

    String getEffectiveArtifactId() {
        return qualifiedProjectName - '.io'
    }
}
