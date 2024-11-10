package com.playground.banking.application.port.out

import com.playground.banking.adapter.out.external.bank.BankAccount
import com.playground.banking.adapter.out.external.bank.GetBankAccountRequest

interface RequestBankAccountInfoPort {
    fun getBankAccountInfo(request: GetBankAccountRequest): BankAccount
}