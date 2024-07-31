package com.playground.membership.adapter.`in`.web

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class RegisterMembershipController {

    @GetMapping("/")
    fun demo():String {
        return "hello"
    }

}