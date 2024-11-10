package com.playground.banking.adapter.out.persistence

import jakarta.persistence.*
import java.util.UUID

@Entity
@Table(name = "request_firmbanking")
class RequestFirmBankingEntity(

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var requestFirmBankingId: Long = 0,

    var fromBankName: String,

    var fromBankAccountNumber: String,

    var toBankName: String,

    var toBankAccountNumber: String,

    var moneyAmount: Int,

    var firmBankingStatus: Int,

    var uuid: String
)