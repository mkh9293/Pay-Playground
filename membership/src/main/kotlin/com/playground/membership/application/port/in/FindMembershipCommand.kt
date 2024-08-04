package com.playground.membership.application.port.`in`

import jakarta.validation.constraints.NotBlank

data class FindMembershipCommand(
    @field:NotBlank
    val membershipId: Long
) {

    companion object {
        fun toCommand(membershipId: Long): FindMembershipCommand {
            return FindMembershipCommand(
                membershipId = membershipId
            )
        }
    }

}