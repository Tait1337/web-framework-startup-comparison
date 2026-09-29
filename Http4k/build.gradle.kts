plugins {
    application
    kotlin("jvm") version "2.4.20"
    id("com.gradleup.shadow") version "9.6.1"
}

repositories {
    mavenCentral()
}

application {
    mainClass.set("com.example.AppKt")
    group = "com.example"
    version = "0.0.1-SNAPSHOT"
}

kotlin {
    jvmToolchain(25)
}

dependencies {
    implementation(kotlin("stdlib-jdk8"))
    implementation(kotlin("reflect"))
    implementation(platform("org.http4k:http4k-bom:6.60.0.0"))
    implementation("org.http4k:http4k-core")
    implementation("org.http4k", "http4k-server-apache", "6.60.0.0")
    implementation("org.http4k", "http4k-format-jackson", "6.60.0.0")
    implementation("io.github.microutils", "kotlin-logging", "2.1.23")
    implementation("org.slf4j", "slf4j-simple", "2.0.19")

}

tasks.shadowJar {
    manifest {
        attributes("Main-Class" to application.mainClass)
    }
    mergeServiceFiles()
}
