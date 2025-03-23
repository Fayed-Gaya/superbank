package com.superbank.superbank.controller

import com.superbank.superbank.service.HelloService
import org.junit.jupiter.api.Test
import org.mockito.Mockito.`when`
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest
import org.springframework.boot.test.mock.mockito.MockBean
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get
import org.springframework.test.web.servlet.result.MockMvcResultMatchers.status
import org.springframework.test.web.servlet.result.MockMvcResultMatchers.content


@WebMvcTest(HelloController::class)
class HelloControllerTest {

    @Autowired
    private lateinit var mockMvc: MockMvc

    @MockBean
    private lateinit var helloService: HelloService

    @Test
    fun `Test HelloController happy path`() {
        `when`(helloService.hello()).thenReturn("Hello World!")

        // Perform a GET request to the "/" endpoint and verify the response
        mockMvc.perform(get("/hello-world"))
            .andExpect(status().isOk)  // Check if the status is HTTP 200 OK
            .andExpect(content().string("Hello World!"))  // Check if the response body is "Hello World!"
    }


}