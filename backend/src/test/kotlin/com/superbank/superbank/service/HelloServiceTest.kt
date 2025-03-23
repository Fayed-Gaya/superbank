package com.superbank.superbank.service

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class HelloServiceTest {

    private val helloService = HelloService()
    @Test
    fun `HelloService Hello method happy path test`() {

        val result = helloService.hello()

        assertEquals("Hello World!", result)
    }
}