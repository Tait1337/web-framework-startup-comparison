package com.example

import jakarta.inject.Inject
import jakarta.ws.rs.*
import jakarta.ws.rs.core.MediaType
import jakarta.ws.rs.core.Response

@Path("/greet/{name}")
@Consumes(MediaType.TEXT_HTML)
class App {

    @Inject
    lateinit var handler: Handler

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    fun handle(@PathParam("name") name: String): Response {
        return handler.handle(name)
    }
}
