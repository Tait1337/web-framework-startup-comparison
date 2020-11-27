package com.example

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.http.MediaType
import org.springframework.web.reactive.function.server.coRouter

@Configuration
class Router() {

    @Bean
    fun route(handler: Handler) = coRouter {
        accept(MediaType.TEXT_HTML).nest {
            GET("/greet/{name}", handler::handle)
        }
    }
}