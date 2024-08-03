package com.playground.membership.application.port.`in`

import com.playground.membership.domain.Membership
import jakarta.validation.Valid

interface RegisterMembershipUseCase {

    fun registerMembership(@Valid command: RegisterMembershipCommand): Membership

}