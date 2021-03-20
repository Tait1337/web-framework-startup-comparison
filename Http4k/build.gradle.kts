plugins {
    application
    kotlin("jvm") version "1.4.31"
    id("com.github.johnrengelman.shadow") version "6.1.0"
}

group = "com.example"
version = "0.0.1-SNAPSHOT"
java.sourceCompatibility = JavaVersion.VERSION_11
application.mainClassName = "com.example.AppKt"

repositories {
    mavenCentral()
    jcenter()
}

dependencies {
    implementation(kotlin("stdlib-jdk8"))
    implementation(platform("org.http4k:http4k-bom:4.4.2.0"))
    implementation("org.http4k:http4k-core")
    implementation("org.http4k", "http4k-server-apache", "4.4.2.0")
    implementation("org.http4k", "http4k-format-jackson", "4.4.2.0")
    implementation("io.github.microutils", "kotlin-logging", "2.0.6")
    implementation("org.slf4j", "slf4j-simple", "1.7.30")
}

tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile> {
    kotlinOptions {
        jvmTarget = "11"
    }
}

tasks.shadowJar {
    manifest {
        attributes("Main-Class" to application.mainClassName)
    }
    mergeServiceFiles()
}
