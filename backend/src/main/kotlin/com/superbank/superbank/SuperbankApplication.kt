package com.superbank.superbank

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SuperbankApplication

fun main(args: Array<String>) {
    runApplication<SuperbankApplication>(*args)
}
