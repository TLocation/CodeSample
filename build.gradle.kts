plugins {
    kotlin("jvm") version "1.8.21"
    application
    id("java")
}

group = "com.location"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
// add maven url
    maven {
        url = uri("https://gitlab.hi-walle.com/xiaolong.tian/maven/raw/master/repository/")
    }

}

dependencies {
    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}

kotlin {
    jvmToolchain(11)
}

application {
    mainClass.set("MainKt")
}