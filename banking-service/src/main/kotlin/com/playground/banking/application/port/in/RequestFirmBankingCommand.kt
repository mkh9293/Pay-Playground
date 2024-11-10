package com.playground.banking.application.port.`in`

import com.playground.banking.adapter.`in`.web.RequestFirmBankingRequest
import jakarta.validation.constraints.NotBlank

data class RequestFirmBankingCommand(
    @field:NotBlank
    val fromBankName: String,

    @field:NotBlank
    val fromBankAccountNumber: String,

    @field:NotBlank
    val toBankName: String,

    @field:NotBlank
    val toBankAccountNumber: String,

    val moneyAmount: Int,

    @field:NotBlank
    val firmBankingStatus: String
) {

    companion object {
        fun toCommand(request: RequestFirmBankingRequest): RequestFirmBankingCommand {
            return RequestFirmBankingCommand(
                fromBankName = request.fromBankName,
                fromBankAccountNumber = request.fromBankAccountNumber,
                toBankName = request.toBankName,
                toBankAccountNumber = request.toBankAccountNumber,
                moneyAmount = request.moneyAmount,
                firmBankingStatus = "0"
            )
        }
    }

}