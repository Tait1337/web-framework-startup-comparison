package com.example

import org.http4k.server.ApacheServer
import org.http4k.server.asServer
import mu.KotlinLogging

private val LOGGER = KotlinLogging.logger {}

fun main() {
    val start = System.nanoTime()
    router().asServer(ApacheServer(8080)).start()
    val end = System.nanoTime()
    LOGGER.info("App started in ${(end - start) / 1000000}ms")
}
