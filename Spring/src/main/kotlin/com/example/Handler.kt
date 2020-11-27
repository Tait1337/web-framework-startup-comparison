package com.example

import org.springframework.stereotype.Component
import org.springframework.web.reactive.function.server.ServerRequest
import org.springframework.web.reactive.function.server.ServerResponse
import org.springframework.web.reactive.function.server.bodyValueAndAwait
import org.springframework.web.reactive.function.server.json
import java.time.LocalDateTime

@Component
class Handler {

    suspend fun handle(request: ServerRequest): ServerResponse {
        val greeting = Greeting(LocalDateTime.now(), request.pathVariable("name"), "Hello!")
        return ServerResponse.ok().json().bodyValueAndAwait(greeting)
    }
}