rootProject.name = "daily_coding_problem"

pluginManagement {
    val kotlin_version: String by settings
    plugins {
        java
        kotlin("jvm") version kotlin_version
    }
}
