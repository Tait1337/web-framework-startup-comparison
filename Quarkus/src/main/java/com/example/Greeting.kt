package com.example

import io.quarkus.runtime.annotations.RegisterForReflection
import java.time.LocalDateTime

@RegisterForReflection
data class Greeting(val timestamp: LocalDateTime, val name: String, val message: String)
