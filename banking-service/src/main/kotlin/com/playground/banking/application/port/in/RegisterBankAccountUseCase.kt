package com.playground.banking.application.port.`in`

import com.playground.banking.domain.RegisteredBankAccount
import jakarta.validation.Valid

interface RegisterBankAccountUseCase {

    fun registerBankAccount(@Valid command: RegisterBankAccountCommand): RegisteredBankAccount?

}