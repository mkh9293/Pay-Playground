package com.playground.membership.adapter.`in`.web

import com.playground.membership.application.port.`in`.RegisterMembershipCommand
import com.playground.membership.application.port.`in`.RegisterMembershipUseCase
import com.playground.membership.common.WebAdapter
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@WebAdapter
@RestController
class RegisterMembershipController(
    private val registerMembershipUseCase: RegisterMembershipUseCase
) {

    @PostMapping("/membership/register")
    fun registerMembership(@RequestBody request: RegisterMembershipRequest) {
        val command = RegisterMembershipCommand.of(request)

        registerMembershipUseCase.registerMembership(command)
    }

}