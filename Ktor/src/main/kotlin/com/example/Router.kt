package com.example

import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.routing.*

fun Routing.router() {
    accept(ContentType.Text.Html) {
        get("/greet/{name}") { getGreetHandler(call) }
    }
}