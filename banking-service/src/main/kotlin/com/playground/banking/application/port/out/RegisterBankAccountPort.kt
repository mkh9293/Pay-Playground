package com.playground.banking.application.port.out

import com.playground.banking.adapter.out.persistence.RegisteredBankAccountEntity
import com.playground.banking.application.port.`in`.RegisterBankAccountCommand

interface RegisterBankAccountPort {
    fun createRegisteredBankAccount(command: RegisterBankAccountCommand): RegisteredBankAccountEntity
}