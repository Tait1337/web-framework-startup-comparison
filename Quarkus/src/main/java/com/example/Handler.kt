package com.example

import java.time.LocalDateTime
import javax.enterprise.context.Dependent
import javax.ws.rs.core.MediaType
import javax.ws.rs.core.Response

@Dependent
class Handler {

    fun handle(name: String): Response {
        val greeting = Greeting(LocalDateTime.now(), name, "Hello!")
        return Response.ok().type(MediaType.APPLICATION_JSON).entity(greeting).build()
    }
}