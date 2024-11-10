package com.playground.banking.adapter.out.external.bank

import com.playground.banking.application.port.out.RequestBankAccountInfoPort
import com.playground.common.ExternalSystemAdapter

@ExternalSystemAdapter
class BankAccountAdapter: RequestBankAccountInfoPort {

    override fun getBankAccountInfo(request: GetBankAccountRequest): BankAccount {
        // todo: always true to test
        return BankAccount(
            request.bankName,
            request.bankAccountNumber,
            true
        )
    }

}