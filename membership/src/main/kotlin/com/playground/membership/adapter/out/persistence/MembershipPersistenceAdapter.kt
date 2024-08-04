package com.playground.membership.adapter.out.persistence

import com.playground.membership.application.port.`in`.FindMembershipCommand
import com.playground.membership.application.port.`in`.RegisterMembershipCommand
import com.playground.membership.application.port.out.FindMembershipPort
import com.playground.membership.application.port.out.RegisterMembershipPort
import com.playground.membership.common.PersistenceAdapter

@PersistenceAdapter
class MembershipPersistenceAdapter(
    private val membershipRepository: MembershipRepository
): RegisterMembershipPort, FindMembershipPort {

    override fun createMembership(command: RegisterMembershipCommand): MembershipEntity {
        return membershipRepository.save(
            MembershipEntity(
                name = command.name,
                email = command.email,
                address = command.address,
                isValid = command.isValid,
                isCorp = command.isCorp
            )
        )
    }

    override fun findMembershipById(command: FindMembershipCommand): MembershipEntity {
        return membershipRepository.findById(command.membershipId).orElseThrow()
    }

}