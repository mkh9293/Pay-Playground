package com.playground.membership.config

import io.swagger.v3.oas.annotations.OpenAPIDefinition
import io.swagger.v3.oas.annotations.info.Info
import org.springdoc.core.models.GroupedOpenApi
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@OpenAPIDefinition(
    info = Info(
        title = "멤버십 API 명세",
        description = "멤버십 API 명세",
        version = "v1"
    )
)
@Configuration
class SwaggerConfig {

    @Bean
    fun openApi(): GroupedOpenApi {
        return GroupedOpenApi.builder()
            .group("membership")
            .pathsToMatch("/membership/**")
            .build()
    }

}