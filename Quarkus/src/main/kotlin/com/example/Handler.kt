package com.example

import java.time.LocalDateTime
import jakarta.enterprise.context.Dependent
import jakarta.ws.rs.core.MediaType
import jakarta.ws.rs.core.Response

@Dependent
class Handler {

    fun handle(name: String): Response {
        val greeting = Greeting(LocalDateTime.now(), name, "Hello!")
        return Response.ok().type(MediaType.APPLICATION_JSON).entity(greeting).build()
    }
}
