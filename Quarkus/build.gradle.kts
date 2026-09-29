plugins {
	id("io.quarkus") version "3.39.5"
		kotlin("plugin.allopen") version "2.4.20"
		kotlin("jvm") version "2.4.20"
}

group = "com.example"
version = "0.0.1-SNAPSHOT"
repositories {
	mavenCentral()
}

kotlin {
	jvmToolchain(25)
}

dependencies {
	implementation(enforcedPlatform("io.quarkus:quarkus-universe-bom:3.39.5"))
	implementation("io.quarkus:quarkus-arc")
	implementation("io.quarkus:quarkus-rest")
	implementation("jakarta.ws.rs:jakarta.ws.rs-api:4.0.0")
	implementation("jakarta.inject:jakarta.inject-api:2.0.1")
}
