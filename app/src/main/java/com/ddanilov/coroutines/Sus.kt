package com.ddanilov.coroutines

import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.yield
import kotlin.coroutines.Continuation
import kotlin.coroutines.CoroutineContext
import kotlin.coroutines.resume
import kotlin.coroutines.suspendCoroutine

fun main() = runBlocking {
TODO()
    val result = suspendCoroutine {

        it.resume<String>("")
    }
}

class Test : Continuation<String> {
    override val context: CoroutineContext
        get() = TODO("Not yet implemented")

    override fun resumeWith(result: Result<String>) {

    }

}