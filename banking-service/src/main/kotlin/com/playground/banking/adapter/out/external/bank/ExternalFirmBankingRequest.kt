package com.playground.banking.adapter.out.external.bank

data class ExternalFirmBankingRequest(
    val fromBankName: String,
    val fromBankAccountNumber: String,
    val toBankName: String,
    val toBankAccountNumber: String
)