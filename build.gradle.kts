plugins {
    kotlin("jvm") version "1.8.0"
    application
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}

// Got error "no class roots are found in the JDK path"
// Following workaround from https://youtrack.jetbrains.com/issue/KTIJ-24466/kotlinc-no-class-roots-are-found-in-the-JDK-path-usr-lib-jvm-java-1.18.0
// Disabling default below.

//kotlin {
//    jvmToolchain(8)
//}

// Swap with these bad boy *glasses with smile
tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile> {
    kotlinOptions.jvmTarget = "1.8"
}


application {
    mainClass.set("MainKt")
}