package com.playground.membership.adapter.out.persistence

import com.playground.membership.application.port.`in`.RegisterMembershipCommand
import com.playground.membership.application.port.out.RegisterMembershipPort
import com.playground.membership.common.PersistenceAdapter
import com.playground.membership.domain.Membership

@PersistenceAdapter
class MembershipPersistenceAdapter(
    private val membershipRepository: MembershipRepository
): RegisterMembershipPort {

    override fun createMembership(command: RegisterMembershipCommand): Membership {
        val entity = membershipRepository.save(
            MembershipEntity(
                name = command.name,
                email = command.email,
                address = command.address,
                isValid = command.isValid,
                isCorp = command.isCorp
            )
        )

        return MembershipMapper.toDomain(entity)
    }

}