plugins {
    kotlin("jvm") version "2.0.21"
    id("application")
    id("org.openjfx.javafxplugin") version "0.1.0"
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}

javafx {
    version = "23.0.1"
    modules = listOf("javafx.controls", "javafx.graphics", "javafx.fxml", "javafx.media", "javafx.swing", "javafx.web")
}

dependencies {
    implementation(kotlin("stdlib"))
    implementation("org.openjfx:javafx-controls:23.0.1")
    implementation("org.openjfx:javafx-fxml")
    implementation("org.openjfx:javafx-graphics")
    implementation("org.openjfx:javafx-media")
    implementation("org.openjfx:javafx-swing")
    implementation("org.openjfx:javafx-web")
}