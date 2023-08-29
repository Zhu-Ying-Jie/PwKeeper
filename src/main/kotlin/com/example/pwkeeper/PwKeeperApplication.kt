package com.example.pwkeeper

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class PwKeeperApplication

fun main(args: Array<String>) {
    runApplication<PwKeeperApplication>(*args)
}
