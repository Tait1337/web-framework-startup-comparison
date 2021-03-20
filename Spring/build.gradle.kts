plugins {
	kotlin("jvm") version "1.4.31"
	kotlin("plugin.spring") version "1.4.31"
	id("org.springframework.boot") version "2.4.4"
	id("io.spring.dependency-management") version "1.0.11.RELEASE"
	id("org.springframework.experimental.aot") version "0.9.0"
}

group = "com.example"
version = "0.0.1-SNAPSHOT"
java.sourceCompatibility = JavaVersion.VERSION_11

repositories {
	mavenCentral()
	maven { url = uri("https://repo.spring.io/release") }
}

dependencies {
	implementation("org.springframework.boot:spring-boot-starter-webflux")
	implementation("com.fasterxml.jackson.module:jackson-module-kotlin")
	implementation("io.projectreactor.kotlin:reactor-kotlin-extensions")
	implementation("org.jetbrains.kotlinx:kotlinx-coroutines-reactor")
	implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
	implementation("org.jetbrains.kotlin:kotlin-reflect")
	implementation("org.springframework.experimental:spring-native:0.9.0")
}

tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile> {
	kotlinOptions {
		freeCompilerArgs = listOf("-Xjsr305=strict")
		jvmTarget = "11"
	}
}

tasks.withType<org.springframework.boot.gradle.tasks.bundling.BootBuildImage> {
	builder = "paketobuildpacks/builder:tiny"
	environment = mapOf(
			"BP_NATIVE_IMAGE" to "true",
			"BP_NATIVE_IMAGE_BUILD_ARGUMENTS" to "-Dspring.spel.ignore=true -Dspring.native.remove-yaml-support=true"
	)
}
