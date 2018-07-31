import org.jetbrains.kotlin.contracts.model.structure.UNKNOWN_COMPUTATION.type

buildscript {
    val kotlinVersion = "1.2.30"
    val gradleVersion = "3.1.3"
    repositories {
        google()
        jcenter()
        gradlePluginPortal()
    }
    dependencies {
        classpath("com.android.tools.build:gradle:$gradleVersion")
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:$kotlinVersion")
    }
}

allprojects {
    repositories {
        google()
        jcenter()
    }
}

tasks {
    "clean"(Delete::class) {
        delete(rootDir)
    }
}
