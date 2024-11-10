plugins {
    id("com.palantir.docker") version "0.36.0"
}

group = "com.playground.banking"
version = "1.0.1"

dependencies {
    // common
    implementation(project(":common"))

    // swagger
    implementation("org.springdoc:springdoc-openapi-starter-webmvc-ui:2.6.0")

    runtimeOnly("com.h2database:h2")
    implementation("mysql:mysql-connector-java:8.0.33")
    testImplementation("org.springframework.boot:spring-boot-starter-test")
}

docker {
    name = "${rootProject.name.lowercase()}-${project.name}:${version}"

    files("../Dockerfile", tasks.bootJar.get().outputs.files)

    // Docker 빌드에 필요한 빌드 인자 설정
    buildArgs(mapOf("JAR_FILE" to tasks.bootJar.get().outputs.files.singleFile.name))
}