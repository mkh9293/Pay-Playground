package com.playground.membership.domain

data class Membership(
    private val membershipId: Long,
    private val name: String,
    private val email: String,
    private val address: String,
    private val isValid: Boolean,
    private val isCorp: Boolean
)