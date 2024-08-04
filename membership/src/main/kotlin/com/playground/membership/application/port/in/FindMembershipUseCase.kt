package com.playground.membership.application.port.`in`

import com.playground.membership.domain.Membership
import jakarta.validation.Valid

interface FindMembershipUseCase {

    fun findMembershipById(@Valid command: FindMembershipCommand): Membership

}