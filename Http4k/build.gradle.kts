plugins {
    application
    kotlin("jvm") version "1.6.21"
    id("com.github.johnrengelman.shadow") version "7.1.2"
}

repositories {
    mavenCentral()
}

application {
    mainClass.set("com.example.AppKt")
    group = "com.example"
    version = "0.0.1-SNAPSHOT"
    java.sourceCompatibility = JavaVersion.VERSION_17
}

dependencies {
    implementation(kotlin("stdlib-jdk8"))
    implementation(platform("org.http4k:http4k-bom:4.25.16.2"))
    implementation("org.http4k:http4k-core")
    implementation("org.http4k", "http4k-server-apache", "4.25.16.2")
    implementation("org.http4k", "http4k-format-jackson", "4.25.16.2")
    implementation("io.github.microutils", "kotlin-logging", "2.1.23")
    implementation("org.slf4j", "slf4j-simple", "1.7.36")

}

tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile> {
    kotlinOptions {
        jvmTarget = "17"
    }
}

tasks.shadowJar {
    manifest {
        attributes("Main-Class" to application.mainClass)
    }
    mergeServiceFiles()
}
