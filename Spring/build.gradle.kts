import org.jetbrains.kotlin.gradle.dsl.JvmTarget
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile
import org.springframework.boot.gradle.tasks.bundling.BootBuildImage

plugins {
        application
        id("org.springframework.boot") version "4.1.1"
        id("io.spring.dependency-management") version "1.1.7"
        kotlin("jvm") version "2.4.20"
        kotlin("plugin.spring") version "2.4.20"
}

group = "com.example"
version = "0.0.1-SNAPSHOT"

application {
        mainClass.set("com.example.AppKt")
}

java {
        toolchain {
            languageVersion = JavaLanguageVersion.of(25)
        }
}

repositories {
        maven { url = uri("https://repo.spring.io/release") }
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
        compilerOptions {
            freeCompilerArgs = listOf("-Xjsr305=strict")
            jvmTarget.set(JvmTarget.JVM_25)
        }
}

tasks.withType<BootBuildImage>().configureEach {
        builder = System.getenv("SPRING_NATIVE_BUILDER")
            ?: "docker.io/paketobuildpacks/builder-jammy-tiny:latest"

        environment = mapOf(
            "BP_NATIVE_IMAGE" to "false",
            "BP_JVM_VERSION" to "25"
        )
}
