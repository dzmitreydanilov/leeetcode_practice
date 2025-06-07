package com.ddanilov.coroutines

import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() = runBlocking<Unit> {
    try {
        launch {
            throw RuntimeException()
        }
    } catch (e: Exception) {
        println("Exception $e")
    }
}