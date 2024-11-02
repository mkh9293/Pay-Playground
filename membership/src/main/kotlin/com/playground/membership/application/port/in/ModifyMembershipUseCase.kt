package com.playground.membership.application.port.`in`

import com.playground.membership.domain.Membership
import jakarta.validation.Valid

interface ModifyMembershipUseCase {

    fun modifyMembership(@Valid command: ModifyMembershipCommand): Membership

}