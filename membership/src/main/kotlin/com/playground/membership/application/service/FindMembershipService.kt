package com.playground.membership.application.service

import com.playground.common.UseCase
import com.playground.membership.adapter.out.persistence.MembershipMapper
import com.playground.membership.application.port.`in`.FindMembershipCommand
import com.playground.membership.application.port.`in`.FindMembershipUseCase
import com.playground.membership.application.port.out.FindMembershipPort
import com.playground.membership.domain.Membership
import org.springframework.transaction.annotation.Transactional

@Transactional
@UseCase
class FindMembershipService(
    private val findMembershipPort: FindMembershipPort
): FindMembershipUseCase {

    override fun findMembershipById(command: FindMembershipCommand): Membership {
        val result = findMembershipPort.findMembershipById(command)

        return MembershipMapper.toDomain(result)
    }

}