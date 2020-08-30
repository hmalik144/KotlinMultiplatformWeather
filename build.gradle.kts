buildscript {
    val kotlin_version = "1.3.50"
    val ktorVersion = "1.2.1"
    val serializationVersion = "0.11.0"
    val coroutineVersion = "1.3.7"

    repositories {
        gradlePluginPortal()
        jcenter()
        google()
        mavenCentral()
        maven("http://dl.bintray.com/kotlin/kotlin-eap")
        maven ( "https://kotlin.bintray.com/kotlinx" )
        maven ( "https://plugins.gradle.org/m2/" )
        maven ( "https://dl.bintray.com/soywiz/soywiz" )
        maven ( "http://dl.bintray.com/kotlin/kotlinx.html" )
        maven ( "https://kotlin.bintray.com/kotlin-js-wrappers" )
    }
    dependencies {

        classpath("org.jetbrains.kotlin:kotlin-frontend-plugin:0.0.45")
        classpath("com.android.tools.build:gradle:3.5.2")
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:$kotlin_version")
        classpath("com.github.jengelman.gradle.plugins:shadow:5.0.0")
        classpath("org.jetbrains.kotlin:kotlin-serialization:$kotlin_version")

    }
}

group = "me.h_mal"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

allprojects {
    repositories {
        google()
        jcenter()

    }
}
