package com.superbank.backend.controller

import com.superbank.backend.service.HelloService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HelloController(
    private val helloService: HelloService
) {
    @GetMapping("/hello-world")
    fun home(): String {
        return helloService.hello()
    }
}
