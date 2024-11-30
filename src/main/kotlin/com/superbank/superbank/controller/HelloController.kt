package com.superbank.superbank.controller

import com.superbank.superbank.service.HelloService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HelloController(
    private val helloService: HelloService
) {
    // Test
    @GetMapping("/hello-world")
    fun home(): String {
        return helloService.hello()
    }
}
