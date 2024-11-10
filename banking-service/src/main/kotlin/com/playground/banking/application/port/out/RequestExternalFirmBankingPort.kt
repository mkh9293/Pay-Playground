package com.playground.banking.application.port.out

import com.playground.banking.adapter.out.external.bank.ExternalFirmBankingRequest
import com.playground.banking.adapter.out.external.bank.FirmBankingResult

interface RequestExternalFirmBankingPort {
    fun requestExternalFirmBanking(request: ExternalFirmBankingRequest): FirmBankingResult
}