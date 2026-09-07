pluginManagement {
    repositories {
        // Legacy repository required by Spring Native / Spring AOT 0.12.x.
        maven {
            url = uri("https://repo.spring.io/plugins-release")
        }

        maven {
            url = uri("https://repo.spring.io/release")
        }

        gradlePluginPortal()
        mavenCentral()
    }
}

dependencyResolutionManagement {
    repositories {
        maven {
            url = uri("https://repo.spring.io/release")
        }

        mavenCentral()
    }
}

rootProject.name = "spring"
