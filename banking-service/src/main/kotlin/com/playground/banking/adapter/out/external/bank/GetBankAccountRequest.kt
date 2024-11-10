package com.playground.banking.adapter.out.external.bank

data class GetBankAccountRequest(
    val bankName: String,
    val bankAccountNumber: String
)