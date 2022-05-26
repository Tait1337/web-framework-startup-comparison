package com.example

import io.ktor.serialization.kotlinx.json.*
import io.ktor.server.application.*
import io.ktor.server.cio.*
import io.ktor.server.engine.*
import io.ktor.server.plugins.contentnegotiation.*
import io.ktor.server.routing.*

fun main() {
    val start = System.nanoTime()
    val server = embeddedServer(CIO, port = 8080) {
        install(ContentNegotiation) {
            json()
        }
        routing {
            router()
        }
    }
    server.environment.monitor.subscribe(ApplicationStarted) {
        val end = System.nanoTime()
        server.environment.log.info("App started in ${(end - start) / 1000000}ms")
    }
    server.start(wait = true)
}