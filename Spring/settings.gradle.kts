pluginManagement {
    repositories {
        maven {
            url = uri("https://repo.spring.io/milestone")
        }
        maven {
            url = uri("https://repo.spring.io/snapshot")
        }

        mavenCentral()
        gradlePluginPortal()
    }

    resolutionStrategy {
        eachPlugin {
            if (requested.id.id == "org.springframework.experimental.aot") {
                useModule(
                    "org.springframework.experimental:spring-aot-gradle-plugin:${requested.version}"
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
            url = uri("https://repo.spring.io/snapshot")
        }

        mavenCentral()
    }
}

rootProject.name = "spring"
