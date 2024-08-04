package com.playground.membership.application.port.out

import com.playground.membership.adapter.out.persistence.MembershipEntity
import com.playground.membership.application.port.`in`.FindMembershipCommand

interface FindMembershipPort {
    fun findMembershipById(command: FindMembershipCommand): MembershipEntity
}