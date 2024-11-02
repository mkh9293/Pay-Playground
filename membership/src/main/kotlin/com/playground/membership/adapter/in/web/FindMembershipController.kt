package com.playground.membership.adapter.`in`.web

import com.playground.membership.application.port.`in`.FindMembershipCommand
import com.playground.membership.application.port.`in`.FindMembershipUseCase
import com.playground.membership.domain.Membership
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/membership")
class FindMembershipController(
    private val findMembershipUseCase: FindMembershipUseCase
) {

    @GetMapping("/{membershipId}")
    fun findMembershipById(@PathVariable membershipId: String): ResponseEntity<Membership> {
        val command = FindMembershipCommand.toCommand(membershipId)

        val result = findMembershipUseCase.findMembershipById(command)

        return ResponseEntity.ok(result)
    }

}