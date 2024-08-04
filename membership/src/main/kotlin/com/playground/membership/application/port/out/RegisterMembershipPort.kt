package com.playground.membership.application.port.out

import com.playground.membership.adapter.out.persistence.MembershipEntity
import com.playground.membership.application.port.`in`.RegisterMembershipCommand

interface RegisterMembershipPort {
    fun createMembership(command: RegisterMembershipCommand): MembershipEntity
}