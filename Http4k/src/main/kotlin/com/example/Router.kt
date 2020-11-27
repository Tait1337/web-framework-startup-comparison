package com.example

import org.http4k.core.HttpHandler
import org.http4k.core.Method
import org.http4k.routing.bind
import org.http4k.routing.routes

fun router(): HttpHandler {
    return routes(
            "/greet/{name}" bind Method.GET to getGreetHandler
    )
}


