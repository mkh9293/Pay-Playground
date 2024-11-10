package com.playground.banking.adapter.out.persistence

import jakarta.persistence.*

@Entity
@Table(name = "registered_bank_account")
class RegisteredBankAccountEntity(

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var registeredBankAccountId: Long = 0,

    var membershipId: String,

    var bankName: String, // enum

    var bankAccountNumber: String,

    var linkedStatusIsValid: Boolean
)