rootProject.name = "spring"
pluginManagement {
    repositories {
        maven { url = uri("https://repo.spring.io/release") }
        maven { url = uri("https://repo.spring.io/snapshot") }
        gradlePluginPortal()
    }
}