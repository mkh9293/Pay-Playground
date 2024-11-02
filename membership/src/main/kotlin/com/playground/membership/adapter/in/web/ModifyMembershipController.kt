package com.playground.membership.adapter.`in`.web

import com.playground.common.WebAdapter
import com.playground.membership.application.port.`in`.ModifyMembershipCommand
import com.playground.membership.application.port.`in`.ModifyMembershipUseCase
import com.playground.membership.domain.Membership
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@WebAdapter
@RestController
@RequestMapping("/membership/modify")
class ModifyMembershipController(
    private val modifyMembershipUseCase: ModifyMembershipUseCase
) {

    @PutMapping("/{membershipId}")
    fun modifyMembershipById(
        @PathVariable membershipId: String,
        @RequestBody request: ModifyMembershipRequest
    ): ResponseEntity<Membership> {
        val command = ModifyMembershipCommand.toCommand(membershipId, request)

        return ResponseEntity.ok()
            .body(modifyMembershipUseCase.modifyMembership(command))
    }

}