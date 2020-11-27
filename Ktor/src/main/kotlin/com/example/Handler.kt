package com.example

import io.ktor.application.*
import io.ktor.http.*
import io.ktor.response.*
import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json
import java.time.LocalDateTime

suspend fun getGreetHandler(call: ApplicationCall) {
    val greeting = Greeting(LocalDateTime.now(), call.parameters["name"]!!, "Hello!")
    //https://github.com/Kotlin/kotlinx.serialization/issues/1125
    call.respondText(Json.encodeToString(Greeting.serializer(), greeting), ContentType.Application.Json, HttpStatusCode.OK) //call.respond(HttpStatusCode.OK, greeting)
}