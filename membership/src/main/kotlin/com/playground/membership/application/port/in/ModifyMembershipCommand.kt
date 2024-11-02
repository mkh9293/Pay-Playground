package com.playground.membership.application.port.`in`

import com.playground.membership.adapter.`in`.web.ModifyMembershipRequest
import jakarta.validation.constraints.AssertTrue
import jakarta.validation.constraints.NotBlank

data class ModifyMembershipCommand(
    @field:NotBlank
    val membershipId: String,

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
        fun toCommand(membershipId: String, request: ModifyMembershipRequest): ModifyMembershipCommand {
            return ModifyMembershipCommand(
                membershipId = membershipId,
                name = request.name,
                email = request.email,
                address = request.address,
                isValid = request.isValid,
                isCorp = request.isCorp
            )
        }
    }

}