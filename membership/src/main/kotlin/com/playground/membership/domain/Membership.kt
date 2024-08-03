package com.playground.membership.domain

import com.playground.membership.adapter.out.persistence.MembershipEntity

data class Membership(
    val membershipId: Long,
    val name: String,
    val email: String,
    val address: String,
    val isValid: Boolean,
    val isCorp: Boolean
) {

    companion object {
        fun from(entity: MembershipEntity): Membership {
            return Membership(
                membershipId = entity.membershipId,
                name = entity.name,
                address = entity.address,
                email = entity.email,
                isValid = entity.isValid,
                isCorp = entity.isCorp
            )
        }
    }

}