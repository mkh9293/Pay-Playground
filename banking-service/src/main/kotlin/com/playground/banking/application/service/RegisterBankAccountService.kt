package com.playground.banking.application.service

import com.playground.banking.adapter.out.external.bank.GetBankAccountRequest
import com.playground.common.UseCase
import com.playground.banking.adapter.out.persistence.RegisteredBankAccountMapper
import com.playground.banking.application.port.`in`.RegisterBankAccountCommand
import com.playground.banking.application.port.`in`.RegisterBankAccountUseCase
import com.playground.banking.application.port.out.RegisterBankAccountPort
import com.playground.banking.application.port.out.RequestBankAccountInfoPort
import com.playground.banking.domain.RegisteredBankAccount
import org.springframework.transaction.annotation.Transactional

@UseCase
class RegisterBankAccountService(
    private val registerBankAccountPort: RegisterBankAccountPort,
    private val requestBankAccountInfoPort: RequestBankAccountInfoPort
): RegisterBankAccountUseCase {

    @Transactional
    override fun registerBankAccount(command: RegisterBankAccountCommand): RegisteredBankAccount? {
        val accountInfo = requestBankAccountInfoPort.getBankAccountInfo(
            GetBankAccountRequest(command.bankName, command.bankAccountNumber)
        )

        return if(accountInfo.isValid) {
            val result = registerBankAccountPort.createRegisteredBankAccount(command)

            RegisteredBankAccountMapper.toDomain(result)
        } else {
            null
        }

    }

}