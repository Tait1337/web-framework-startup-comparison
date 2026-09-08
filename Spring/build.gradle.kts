import org.jetbrains.kotlin.gradle.tasks.KotlinCompile
import org.springframework.boot.gradle.tasks.bundling.BootBuildImage

plugins {
    application
    id("org.springframework.boot") version "2.7.0"
    id("io.spring.dependency-management") version "1.0.11.RELEASE"
    id("org.springframework.experimental.aot") version "0.12.0"
    kotlin("jvm") version "1.6.21"
    kotlin("plugin.spring") version "1.6.21"
}

group = "com.example"
version = "0.0.1-SNAPSHOT"

application {
    mainClass.set("com.example.AppKt")
}

java {
    sourceCompatibility = JavaVersion.VERSION_17
}

repositories {
    maven {
        url = uri("https://repo.spring.io/milestone")
    }
    maven {
        url = uri("https://repo.spring.io/release")
    }
    mavenCentral()
}

dependencies {
    implementation("org.springframework.boot:spring-boot-starter-webflux")
    implementation("com.fasterxml.jackson.module:jackson-module-kotlin")
    implementation("io.projectreactor.kotlin:reactor-kotlin-extensions")
    implementation("org.jetbrains.kotlin:kotlin-reflect")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-reactor")
}

tasks.withType<KotlinCompile>().configureEach {
    kotlinOptions {
        freeCompilerArgs = listOf("-Xjsr305=strict")
        jvmTarget = "17"
    }
}

tasks.named<BootBuildImage>("bootBuildImage") {
    builder = System.getenv("SPRING_NATIVE_BUILDER")
        ?: "docker.io/paketobuildpacks/builder-jammy-tiny:latest"

    environment = mapOf(
        "BP_NATIVE_IMAGE" to "true",
        "BP_JVM_VERSION" to "17"
    )
}
