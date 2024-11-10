package com.playground.banking.adapter.`in`.web

import com.playground.banking.application.port.`in`.RegisterBankAccountCommand
import com.playground.banking.application.port.`in`.RegisterBankAccountUseCase
import com.playground.banking.application.port.`in`.RequestFirmBankingCommand
import com.playground.banking.application.port.`in`.RequestFirmBankingUseCase
import com.playground.banking.domain.FirmBankingRequest
import com.playground.common.WebAdapter
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@WebAdapter
@RestController
class RequestFirmBankingController(
    private val requestFirmBankingUseCase: RequestFirmBankingUseCase
) {

    @PostMapping("/banking/firmbanking/request")
    fun requestFirmBanking(@RequestBody request: RequestFirmBankingRequest): FirmBankingRequest {
        val command = RequestFirmBankingCommand.toCommand(request)

        return requestFirmBankingUseCase.requestFirmBanking(command)
    }

}