package com.playground.banking.application.port.out

import com.playground.banking.adapter.out.persistence.RequestFirmBankingEntity
import java.util.UUID

interface RequestFirmBankingPort {
    fun requestFirmBanking(
        fromBankName: String,
        fromBankAccountNumber: String,
        toBankName: String,
        toBankAccountNumber: String,
        moneyAmount: Int,
        firmBankingStatus: Int,
        uuid: UUID
    ): RequestFirmBankingEntity
}