package com.playground.membership.common

import org.springframework.core.annotation.AliasFor
import org.springframework.stereotype.Component

/**
 * An annotation class for specifying service layer without any functionality
 */
@Target(AnnotationTarget.CLASS)
@Retention(AnnotationRetention.RUNTIME)
@MustBeDocumented
@Component
annotation class UseCase(
    // provide value to register in spring bean
    @get:AliasFor(annotation = Component::class)
    val value: String = ""
)