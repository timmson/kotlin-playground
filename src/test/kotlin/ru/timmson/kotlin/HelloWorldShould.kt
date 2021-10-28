package ru.timmson.kotlin

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

class HelloWorldShould {

    private lateinit var helloWorld: HelloWorld

    @BeforeEach
    internal fun setUp() {
        helloWorld = HelloWorld()
    }

    @Test
    internal fun helloWorld() {
        assertEquals("Hello World!", helloWorld.sayHelloWorld())
    }
}