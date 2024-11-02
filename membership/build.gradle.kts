group = "com.playground.membership"

dependencies {
    // common
    implementation(project(":common"))

    // swagger
    implementation("org.springdoc:springdoc-openapi-starter-webmvc-ui:2.6.0")

    runtimeOnly("com.h2database:h2")
    testImplementation("org.springframework.boot:spring-boot-starter-test")
}