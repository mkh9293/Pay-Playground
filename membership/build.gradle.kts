plugins {
    id("com.palantir.docker") version "0.36.0"
}

group = "com.playground.membership"
version = "1.0.0"

dependencies {
    // common
    implementation(project(":common"))

    // swagger
    implementation("org.springdoc:springdoc-openapi-starter-webmvc-ui:2.6.0")

    runtimeOnly("com.h2database:h2")
    testImplementation("org.springframework.boot:spring-boot-starter-test")
}

docker {
    name = "${project.group}/${project.name}:${project.version}"
    files("build/libs/${project.name}-${project.version}.jar")
    buildArgs(mapOf("JAR_FILE" to "${project.name}-${project.version}.jar"))
}