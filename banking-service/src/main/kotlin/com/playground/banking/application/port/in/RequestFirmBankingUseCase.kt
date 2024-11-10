package com.playground.banking.application.port.`in`

import com.playground.banking.domain.FirmBankingRequest
import jakarta.validation.Valid

interface RequestFirmBankingUseCase {

    fun requestFirmBanking(@Valid command: RequestFirmBankingCommand): FirmBankingRequest

}