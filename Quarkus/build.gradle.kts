plugins {
	id("io.quarkus") version "2.9.2.Final"
	kotlin("jvm") version "1.6.21"
}

group = "com.example"
version = "0.0.1-SNAPSHOT"
java.sourceCompatibility = JavaVersion.VERSION_17

repositories {
	mavenCentral()
}

dependencies {
	implementation(enforcedPlatform("io.quarkus:quarkus-universe-bom:2.9.2.Final"))
	implementation("io.quarkus:quarkus-arc")
	implementation("io.quarkus:quarkus-resteasy-reactive")
	implementation("io.quarkus:quarkus-resteasy-reactive-jsonb")
}

tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile> {
	kotlinOptions {
		jvmTarget = "17"
	}
}
