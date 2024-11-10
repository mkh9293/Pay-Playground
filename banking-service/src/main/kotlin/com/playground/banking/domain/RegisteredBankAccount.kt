package com.playground.banking.domain

data class RegisteredBankAccount(
    val registeredBankAccountId: String,
    val membershipId: String,
    val bankName: String, // enum
    val bankAccountNumber: String,
    val linkedStatusIsValid: Boolean
)