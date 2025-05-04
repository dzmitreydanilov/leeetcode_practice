package com.ddanilov.new2025.repeate

import kotlin.math.abs

fun main() {
    val work = "ayd"

    val result = minTimeToType(work)

    println(result)
}


/**
 * 16
 * 26 - 16 = 10
 */
private fun minTimeToType(word: String): Int {
    var current = 'a'

    var path = 0

    for (i in word.indices) {
        var move = abs(current - word[i])
        if (move > 13) {
            move = 26 - move
        }
        path += move
        current = word[i]
    }

    return path
}
