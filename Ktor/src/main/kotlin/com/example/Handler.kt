package com.example

import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.response.*
import kotlinx.datetime.Clock
import kotlinx.datetime.TimeZone
import kotlinx.datetime.toLocalDateTime
import kotlinx.serialization.json.Json

suspend fun getGreetHandler(call: ApplicationCall) {
    val greeting = Greeting(Clock.System.now().toLocalDateTime(TimeZone.currentSystemDefault()), call.parameters["name"]!!, "Hello!")
    //https://github.com/Kotlin/kotlinx.serialization/issues/1125
    call.respondText(Json.encodeToString(Greeting.serializer(), greeting), ContentType.Application.Json, HttpStatusCode.OK) //call.respond(HttpStatusCode.OK, greeting)
}