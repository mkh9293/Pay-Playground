package com.playground.membership.adapter.out.persistence

import com.playground.membership.application.port.`in`.FindMembershipCommand
import com.playground.membership.application.port.`in`.ModifyMembershipCommand
import com.playground.membership.application.port.`in`.RegisterMembershipCommand
import com.playground.membership.application.port.out.FindMembershipPort
import com.playground.membership.application.port.out.ModifyMembershipPort
import com.playground.membership.application.port.out.RegisterMembershipPort
import com.playground.membership.common.PersistenceAdapter

@PersistenceAdapter
class MembershipPersistenceAdapter(
    private val membershipRepository: MembershipRepository
): RegisterMembershipPort, FindMembershipPort, ModifyMembershipPort {

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
        return membershipRepository.findById(command.membershipId.toLong()).orElseThrow()
    }

    override fun modifyMembership(command: ModifyMembershipCommand): MembershipEntity {
        val membership = membershipRepository.findById(command.membershipId.toLong()).orElseThrow()

        membership.name = command.name
        membership.email = command.email
        membership.address = command.address
        membership.isValid = command.isValid
        membership.isCorp = command.isCorp

        return membership
    }

}