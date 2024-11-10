package com.playground.banking.adapter.`in`.web

import com.playground.banking.domain.RegisteredBankAccount
import com.playground.common.WebAdapter
import com.playground.banking.application.port.`in`.RegisterBankAccountCommand
import com.playground.banking.application.port.`in`.RegisterBankAccountUseCase
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@WebAdapter
@RestController
class RegisterBankAccountController(
    private val registerBankAccountUseCase: RegisterBankAccountUseCase
) {

    @PostMapping("/banking/account/register")
    fun registerBankAccount(@RequestBody request: RegisterBankAccountRequest): RegisteredBankAccount? {
        val command = RegisterBankAccountCommand.toCommand(request)

        return registerBankAccountUseCase.registerBankAccount(command)
    }

}