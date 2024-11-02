package com.playground.membership.application.port.`in`

import jakarta.validation.constraints.NotBlank

data class FindMembershipCommand(
    @field:NotBlank
    val membershipId: String
) {

    companion object {
        fun toCommand(membershipId: String): FindMembershipCommand {
            return FindMembershipCommand(
                membershipId = membershipId
            )
        }
    }

}