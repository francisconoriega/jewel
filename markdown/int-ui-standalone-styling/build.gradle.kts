plugins {
    jewel
    `jewel-publish`
    `jewel-check-public-api`
    alias(libs.plugins.composeDesktop)
}

dependencies {
    api(projects.markdown.core)
    api(projects.intUi.intUiStandalone)
    api(libs.highlights)
    compileOnly(projects.markdown.extension.gfmAlerts)

    testImplementation(compose.desktop.uiTestJUnit4)
}

publishing.publications.named<MavenPublication>("main") {
    val ijpTarget = project.property("ijp.target") as String
    artifactId = "jewel-markdown-${project.name}-$ijpTarget"
}
