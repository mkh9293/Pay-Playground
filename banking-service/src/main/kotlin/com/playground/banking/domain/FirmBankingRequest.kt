package com.playground.banking.domain

data class FirmBankingRequest(
    val firmBankingRequestId: String,
    val fromBankName: String,
    val fromBankAccountNumber: String,
    val toBankName: String,
    val toBankAccountNumber: String,
    val moneyAmount: Int,
    val firmBankingStatus: Int, // 0: request, 1: success, 2: fail
    val uuid: String
)