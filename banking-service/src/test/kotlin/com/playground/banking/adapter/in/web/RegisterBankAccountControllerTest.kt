package com.playground.banking.adapter.`in`.web

import com.fasterxml.jackson.databind.ObjectMapper
import com.playground.banking.domain.RegisteredBankAccount
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.http.MediaType
import org.springframework.test.context.junit.jupiter.SpringExtension
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders
import org.springframework.test.web.servlet.result.MockMvcResultMatchers

@ExtendWith(SpringExtension::class)
@AutoConfigureMockMvc
@SpringBootTest
class RegisterBankAccountControllerTest {

    @Autowired
    private lateinit var mockMvc: MockMvc

    @Autowired
    private lateinit var mapper: ObjectMapper

    @Test
    fun testRegisterBankAccount() {
        // given
        val request = RegisterBankAccountRequest("1", "kbBank", "1234567890", true)

        val expect = RegisteredBankAccount("1", "1", "kbBank", "1234567890", true)

        // then
        mockMvc.perform(
            MockMvcRequestBuilders.post("/banking/account/register")
                .contentType(MediaType.APPLICATION_JSON)
                .content(mapper.writeValueAsString(request))
        )
            .andExpect(MockMvcResultMatchers.status().isOk)
            .andExpect(MockMvcResultMatchers.content().string(mapper.writeValueAsString(expect)))
    }

}