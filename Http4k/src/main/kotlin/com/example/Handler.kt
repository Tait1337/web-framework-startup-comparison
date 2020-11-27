package com.example

import org.http4k.core.Body
import org.http4k.core.ContentType
import org.http4k.core.Request
import org.http4k.core.Response
import org.http4k.core.Status.Companion.NOT_ACCEPTABLE
import org.http4k.core.Status.Companion.OK
import org.http4k.format.Jackson.auto
import org.http4k.routing.path
import java.time.LocalDateTime

var getGreetHandler = { request: Request ->
    val requestContentType = request.header("Content-type")
    val requiredContentType = ContentType.TEXT_HTML.toHeaderValue()
    if (requestContentType == requiredContentType) Response(NOT_ACCEPTABLE)

    val greeting = Greeting(LocalDateTime.now(), request.path("name")!!, "Hello!")

    val response = Body.auto<Greeting>().toLens()
    response(greeting, Response(OK).header("Content-type", ContentType.APPLICATION_JSON.toHeaderValue()))
}
