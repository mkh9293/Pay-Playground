package com.playground.membership.adapter.out.persistence

import com.playground.membership.application.port.out.RegisterMembershipPort
import com.playground.membership.common.PersistenceAdapter

@PersistenceAdapter
class MembershipPersistenceAdapter(
    private val membershipRepository: MembershipRepository
): RegisterMembershipPort {

    override fun createMembership(name: String, email: String, address: String, isValid: Boolean, isCorp: Boolean): MembershipEntity {
        return membershipRepository.save(
            MembershipEntity(
                name = name,
                address = address,
                email = email,
                isValid = isValid,
                isCorp = isCorp
            )
        )
    }

}