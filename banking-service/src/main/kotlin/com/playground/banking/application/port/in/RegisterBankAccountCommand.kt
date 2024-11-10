package com.playground.banking.application.port.`in`

import com.playground.banking.adapter.`in`.web.RegisterBankAccountRequest
import jakarta.validation.constraints.NotBlank

data class RegisterBankAccountCommand(
    @field:NotBlank
    val membershipId: String,

    @field:NotBlank
    val bankName: String, // enum

    @field:NotBlank
    val bankAccountNumber: String,

    val linkedStatusIsValid: Boolean
) {

    companion object {
        fun toCommand(request: RegisterBankAccountRequest): RegisterBankAccountCommand {
            return RegisterBankAccountCommand(
                membershipId = request.membershipId,
                bankName = request.bankName,
                bankAccountNumber = request.bankAccountNumber,
                linkedStatusIsValid = request.linkedStatusIsValid
            )
        }
    }

}