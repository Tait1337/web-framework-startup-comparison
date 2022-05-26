package com.example

import kotlinx.datetime.LocalDateTime
import kotlinx.serialization.Serializable

@Serializable
data class Greeting(val timestamp: LocalDateTime, val name: String, val message: String)
