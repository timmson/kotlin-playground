plugins {
    application
    kotlin("jvm") version "1.5.31"
}

repositories {
    mavenCentral()
}

group = "ru.timmson"
version = "1.0"

java.sourceCompatibility = JavaVersion.VERSION_11
java.targetCompatibility = JavaVersion.VERSION_11

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.jetbrains.kotlin:kotlin-reflect")
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
}

application {
    mainClass.set("ru.timmson.kotlin.MyClass")
}
