package com.playground.banking.adapter.out.persistence

import com.playground.banking.domain.FirmBankingRequest

object RequestFirmBankingMapper {
    fun toDomain(entity: RequestFirmBankingEntity): FirmBankingRequest {
        return FirmBankingRequest(
            firmBankingRequestId = entity.requestFirmBankingId.toString(),
            fromBankName = entity.fromBankName,
            fromBankAccountNumber = entity.fromBankAccountNumber,
            toBankName = entity.toBankName,
            toBankAccountNumber = entity.toBankAccountNumber,
            moneyAmount = entity.moneyAmount,
            firmBankingStatus = entity.firmBankingStatus,
            uuid = entity.uuid
        )
    }
}