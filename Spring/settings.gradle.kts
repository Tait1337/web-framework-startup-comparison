pluginManagement {
    repositories {
        // The legacy Spring Native artifacts have been exposed through
        // different Spring repository layouts over time.
        maven {
            url = uri("https://repo.spring.io/milestone")
        }
        maven {
            url = uri("https://repo.spring.io/release")
        }

        mavenCentral()
        gradlePluginPortal()
    }

    resolutionStrategy {
        eachPlugin {
            if (requested.id.id == "org.springframework.experimental.aot") {
                // Do not resolve the Gradle plugin marker artifact:
                //
                // org.springframework.experimental.aot:
                // org.springframework.experimental.aot.gradle.plugin
                //
                // Resolve the actual Spring AOT Gradle plugin instead.
                useModule(
                    "org.springframework.experimental:" +
                        "spring-aot-gradle-plugin:${requested.version}"
                )
            }
        }
    }
}

dependencyResolutionManagement {
    repositories {
        maven {
            url = uri("https://repo.spring.io/milestone")
        }
        maven {
            url = uri("https://repo.spring.io/release")
        }

        mavenCentral()
    }
}

rootProject.name = "spring"
