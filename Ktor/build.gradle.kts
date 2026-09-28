plugins {
    application
    kotlin("jvm") version "2.4.20"
        kotlin("plugin.serialization") version "2.4.20"
    id("com.gradleup.shadow") version "9.6.1"
}

application {
    mainClass.set("com.example.AppKt")
    group = "com.example"
    version = "0.0.1-SNAPSHOT"
    java.sourceCompatibility = JavaVersion.VERSION_17
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("ch.qos.logback:logback-classic:1.6.3")
    implementation("io.ktor:ktor-server-cio:3.6.0")
        implementation("io.ktor:ktor-server-content-negotiation:3.6.0")
        implementation("io.ktor:ktor-serialization-kotlinx-json:3.6.0")
        implementation("org.jetbrains.kotlinx:kotlinx-datetime:0.8.0")
}

kotlin {
    jvmToolchain(17)
}

tasks.shadowJar {
    manifest {
        attributes("Main-Class" to application.mainClass)
    }
    mergeServiceFiles()
}
