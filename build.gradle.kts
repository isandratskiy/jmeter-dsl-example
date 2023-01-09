plugins {
    id("java")
}

group = "io.isandratskyi"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation("us.abstracta.jmeter:jmeter-java-dsl:1.4") {
        exclude(group = "org.apache.jmeter", module = "bom")
    }

    testImplementation("org.junit.jupiter:junit-jupiter-api:5.8.1")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.8.1")
}

tasks.getByName<Test>("test") {
    useJUnitPlatform()
}