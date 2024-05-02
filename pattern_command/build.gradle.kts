plugins {
    id("java")
}

group = "ru.smago"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks.withType<Jar> {
    manifest {
        attributes["Main-Class"] = "ru.smago.Main"
    }
}


tasks.test {
    useJUnitPlatform()
}