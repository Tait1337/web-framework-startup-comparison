package com.example

import javax.inject.Inject
import javax.ws.rs.*
import javax.ws.rs.core.MediaType
import javax.ws.rs.core.Response

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