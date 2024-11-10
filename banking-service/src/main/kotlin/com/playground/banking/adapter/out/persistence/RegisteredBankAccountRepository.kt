package com.playground.banking.adapter.out.persistence

import org.springframework.data.jpa.repository.JpaRepository

interface RegisteredBankAccountRepository: JpaRepository<RegisteredBankAccountEntity, Long>