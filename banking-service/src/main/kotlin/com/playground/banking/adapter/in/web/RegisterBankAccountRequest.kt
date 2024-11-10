package com.playground.banking.adapter.`in`.web

data class RegisterBankAccountRequest(
    val membershipId: String,
    val bankName: String, // enum
    val bankAccountNumber: String,
    val linkedStatusIsValid: Boolean
)