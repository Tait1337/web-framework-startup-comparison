plugins {
	id("io.quarkus")  version "1.10.0.Final"
	kotlin("jvm") version "1.4.10"
}

group = "com.example"
version = "0.0.1-SNAPSHOT"
java.sourceCompatibility = JavaVersion.VERSION_11

repositories {
	mavenCentral()
}

dependencies {
	implementation("io.quarkus:quarkus-resteasy-jsonb")
	implementation(enforcedPlatform("io.quarkus:quarkus-bom:1.10.0.Final"))
	implementation("io.quarkus:quarkus-resteasy")
	implementation(kotlin("stdlib-jdk8"))
}

tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile> {
	kotlinOptions {
		jvmTarget = "11"
	}
}
