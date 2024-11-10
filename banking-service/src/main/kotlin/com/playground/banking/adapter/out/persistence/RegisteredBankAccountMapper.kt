package com.playground.banking.adapter.out.persistence

import com.playground.banking.domain.RegisteredBankAccount

object RegisteredBankAccountMapper {
    fun toDomain(entity: RegisteredBankAccountEntity): RegisteredBankAccount {
        return RegisteredBankAccount(
            registeredBankAccountId = entity.registeredBankAccountId.toString(),
            membershipId = entity.membershipId,
            bankName = entity.bankName, // enum
            bankAccountNumber = entity.bankAccountNumber,
            linkedStatusIsValid = entity.linkedStatusIsValid
        )
    }
}