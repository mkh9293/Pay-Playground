package com.playground.membership.application.service

import com.playground.common.UseCase
import com.playground.membership.adapter.out.persistence.MembershipMapper
import com.playground.membership.application.port.`in`.ModifyMembershipCommand
import com.playground.membership.application.port.`in`.ModifyMembershipUseCase
import com.playground.membership.application.port.out.ModifyMembershipPort
import com.playground.membership.domain.Membership
import org.springframework.transaction.annotation.Transactional

@UseCase
class ModifyMembershipService(
    private val modifyMembershipPort: ModifyMembershipPort
): ModifyMembershipUseCase {

    @Transactional
    override fun modifyMembership(command: ModifyMembershipCommand): Membership {
        val result = modifyMembershipPort.modifyMembership(command)

        return MembershipMapper.toDomain(result)
    }

}