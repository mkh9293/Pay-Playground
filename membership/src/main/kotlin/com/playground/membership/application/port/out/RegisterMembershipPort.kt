package com.playground.membership.application.port.out

import com.playground.membership.adapter.out.persistence.MembershipEntity

interface RegisterMembershipPort {

    fun createMembership(
        name: String,
        email: String,
        address: String,
        isValid: Boolean,
        isCorp: Boolean
    ): MembershipEntity

}