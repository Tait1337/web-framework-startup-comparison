package com.example

import io.ktor.application.*
import io.ktor.features.*
import io.ktor.routing.*
import io.ktor.serialization.*
import io.ktor.server.cio.*
import io.ktor.server.engine.*

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