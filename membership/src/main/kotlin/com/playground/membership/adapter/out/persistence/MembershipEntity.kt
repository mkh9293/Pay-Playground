package com.playground.membership.adapter.out.persistence

import jakarta.persistence.*

@Entity
@Table(name = "membership")
class MembershipEntity(

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var membershipId: Long = 0,

    var name: String,

    var address: String,

    var email: String,

    var isValid: Boolean,

    var isCorp: Boolean

)