package com.playground.banking.application.service

import com.playground.banking.adapter.out.external.bank.ExternalFirmBankingRequest
import com.playground.banking.adapter.out.persistence.RequestFirmBankingMapper
import com.playground.banking.application.port.`in`.RequestFirmBankingCommand
import com.playground.banking.application.port.`in`.RequestFirmBankingUseCase
import com.playground.banking.application.port.out.RequestExternalFirmBankingPort
import com.playground.banking.application.port.out.RequestFirmBankingPort
import com.playground.banking.domain.FirmBankingRequest
import com.playground.common.UseCase
import org.springframework.transaction.annotation.Transactional
import java.util.*

@UseCase
class RequestFirmBankingService(
    private val requestFirmBankingPort: RequestFirmBankingPort,
    private val requestExternalFirmBankingPort: RequestExternalFirmBankingPort
): RequestFirmBankingUseCase {

    @Transactional
    override fun requestFirmBanking(command: RequestFirmBankingCommand): FirmBankingRequest {
        val uuid = UUID.randomUUID()

        val requestedEntity = requestFirmBankingPort.requestFirmBanking(
            command.fromBankName,
            command.fromBankAccountNumber,
            command.toBankName,
            command.toBankAccountNumber,
            command.moneyAmount,
            0,
            uuid
        )

        val result = requestExternalFirmBankingPort.requestExternalFirmBanking(
            ExternalFirmBankingRequest(
                command.fromBankName,
                command.fromBankAccountNumber,
                command.toBankName,
                command.toBankAccountNumber
            )
        )

        if(result.resultCode == 0) {
            requestedEntity.firmBankingStatus = 1
        } else {
            requestedEntity.firmBankingStatus = 2
        }

        return RequestFirmBankingMapper.toDomain(requestedEntity)
    }

}