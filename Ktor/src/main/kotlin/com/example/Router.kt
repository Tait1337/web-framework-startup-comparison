package com.example

import io.ktor.application.*
import io.ktor.http.*
import io.ktor.routing.*

fun Routing.router() {
    accept(ContentType.Text.Html) {
        get("/greet/{name}") { getGreetHandler(call) }
    }
}