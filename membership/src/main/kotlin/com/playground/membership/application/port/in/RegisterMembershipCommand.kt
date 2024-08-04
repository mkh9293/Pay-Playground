package com.playground.membership.application.port.`in`

import com.playground.membership.adapter.`in`.web.RegisterMembershipRequest
import jakarta.validation.constraints.AssertTrue
import jakarta.validation.constraints.NotBlank

data class RegisterMembershipCommand(
    @field:NotBlank
    val name: String,

    @field:NotBlank
    val email: String,

    @field:NotBlank
    val address: String,

    @field:AssertTrue
    val isValid: Boolean,

    val isCorp: Boolean
) {

    companion object {
        fun of(request: RegisterMembershipRequest): RegisterMembershipCommand {
            return RegisterMembershipCommand(
                name = request.name,
                email = request.email,
                address = request.address,
                isValid = true,
                isCorp = request.isCorp
            )
        }
    }

}