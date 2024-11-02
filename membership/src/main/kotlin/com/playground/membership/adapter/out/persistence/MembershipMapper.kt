package com.playground.membership.adapter.out.persistence

import com.playground.membership.domain.Membership

object MembershipMapper {
    fun toDomain(entity: MembershipEntity): Membership {
        return Membership(
            membershipId = entity.membershipId.toString(),
            name = entity.name,
            email = entity.email,
            address = entity.address,
            isValid = entity.isValid,
            isCorp = entity.isCorp
        )
    }
}