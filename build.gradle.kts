val ktor_version: String by project

plugins {
    kotlin("jvm") version "1.9.0"
    application
}

group = "com.alkathirikhalid"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

kotlin {
    jvmToolchain(8)
}

application {
    mainClass.set("MainKt")
}

dependencies {
    implementation("io.ktor:ktor-client-core:$ktor_version")
    implementation("io.ktor:ktor-client-cio:$ktor_version")
    implementation("io.ktor:ktor-client-websockets:$ktor_version")
}

tasks.named<JavaExec>("run") {
    standardInput = System.`in`
}