package com.playground.membership.application.port.out

import com.playground.membership.application.port.`in`.RegisterMembershipCommand
import com.playground.membership.domain.Membership

interface RegisterMembershipPort {
    fun createMembership(command: RegisterMembershipCommand): Membership
}