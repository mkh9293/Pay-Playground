package com.playground.banking.adapter.out.persistence

import com.playground.banking.application.port.out.RequestFirmBankingPort
import com.playground.common.PersistenceAdapter
import java.util.*

@PersistenceAdapter
class RequestFirmBankingPersistenceAdapter(
    private val requestFirmBankingRepository: RequestFirmBankingRepository
): RequestFirmBankingPort {

    override fun requestFirmBanking(
        fromBankName: String,
        fromBankAccountNumber: String,
        toBankName: String,
        toBankAccountNumber: String,
        moneyAmount: Int,
        firmBankingStatus: Int,
        uuid: UUID
    ): RequestFirmBankingEntity {
        return requestFirmBankingRepository.save(
            RequestFirmBankingEntity(
                fromBankName = fromBankName,
                fromBankAccountNumber = fromBankAccountNumber,
                toBankName = toBankName,
                toBankAccountNumber = toBankAccountNumber,
                moneyAmount = moneyAmount,
                firmBankingStatus = firmBankingStatus,
                uuid = uuid.toString()
            )
        )
    }

}