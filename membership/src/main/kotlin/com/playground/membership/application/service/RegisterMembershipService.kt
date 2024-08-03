package com.playground.membership.application.service

import com.playground.membership.application.port.`in`.RegisterMembershipCommand
import com.playground.membership.application.port.`in`.RegisterMembershipUseCase
import com.playground.membership.application.port.out.RegisterMembershipPort
import com.playground.membership.common.UseCase
import com.playground.membership.domain.Membership
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@UseCase
class RegisterMembershipService(
    private val registerMembershipPort: RegisterMembershipPort
): RegisterMembershipUseCase {

    @Transactional
    override fun registerMembership(command: RegisterMembershipCommand): Membership {

        val entity = registerMembershipPort.createMembership(
            name = command.name,
            email = command.email,
            address = command.address,
            isValid = command.isValid,
            isCorp = command.isCorp
        )

        return Membership.from(entity)
    }

}