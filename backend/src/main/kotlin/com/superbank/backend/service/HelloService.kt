package com.superbank.backend.service

import org.springframework.stereotype.Service

@Service
class HelloService {
    fun hello(): String {
        return "Hello World!"
    }
}
