package com.playground.membership.application.service

import com.playground.membership.application.port.`in`.RegisterMembershipCommand
import com.playground.membership.application.port.`in`.RegisterMembershipUseCase
import com.playground.membership.application.port.out.RegisterMembershipPort
import com.playground.membership.common.UseCase
import com.playground.membership.domain.Membership
import org.springframework.transaction.annotation.Transactional

@UseCase
class RegisterMembershipService(
    private val registerMembershipPort: RegisterMembershipPort
): RegisterMembershipUseCase {

    @Transactional
    override fun registerMembership(command: RegisterMembershipCommand): Membership {
        return registerMembershipPort.createMembership(command)
    }

}