plugins {
    application
    kotlin("jvm") version "1.4.31"
    kotlin("plugin.serialization") version "1.4.31"
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
    implementation("ch.qos.logback:logback-classic:1.2.3")
    implementation("io.ktor:ktor-server-cio:1.5.2") // implementation("io.ktor:ktor-server-netty:1.4.2")
    implementation("io.ktor:ktor-serialization:1.5.2")
    implementation("org.jetbrains.kotlinx:kotlinx-serialization-json:1.1.0")
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
