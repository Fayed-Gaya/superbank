package com.superbank.backend

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SuperbankApplication

fun main(args: Array<String>) {
    runApplication<SuperbankApplication>(*args)
}
