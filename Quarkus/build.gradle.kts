plugins {
	id("io.quarkus") version "1.12.2.Final"
	kotlin("jvm") version "1.4.31"
}

group = "com.example"
version = "0.0.1-SNAPSHOT"
java.sourceCompatibility = JavaVersion.VERSION_11

repositories {
	mavenCentral()
}

dependencies {
	implementation(enforcedPlatform("io.quarkus:quarkus-universe-bom:1.12.2.Final"))
	implementation("io.quarkus:quarkus-resteasy-jsonb")
	implementation("io.quarkus:quarkus-resteasy")
}

tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile> {
	kotlinOptions {
		jvmTarget = "11"
	}
}
