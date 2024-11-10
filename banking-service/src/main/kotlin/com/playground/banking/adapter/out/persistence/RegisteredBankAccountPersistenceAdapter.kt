package com.playground.banking.adapter.out.persistence

import com.playground.common.PersistenceAdapter
import com.playground.banking.application.port.`in`.RegisterBankAccountCommand
import com.playground.banking.application.port.out.RegisterBankAccountPort

@PersistenceAdapter
class RegisteredBankAccountPersistenceAdapter(
    private val registeredBankAccountRepository: RegisteredBankAccountRepository
): RegisterBankAccountPort {

    override fun createRegisteredBankAccount(command: RegisterBankAccountCommand): RegisteredBankAccountEntity {
        return registeredBankAccountRepository.save(
            RegisteredBankAccountEntity(
                membershipId = command.membershipId,
                bankName = command.bankName,
                bankAccountNumber = command.bankAccountNumber,
                linkedStatusIsValid = command.linkedStatusIsValid
            )
        )
    }

}