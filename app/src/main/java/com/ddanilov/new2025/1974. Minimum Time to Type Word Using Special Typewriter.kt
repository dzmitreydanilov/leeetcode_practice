package com.ddanilov.new2025

import kotlin.math.abs

fun main() {
    val word = "azc"

    val result = minTimeToType(word)

    println(result)
}

/**
 * a b c
 */
private fun minTimeToType(word: String): Int {
    var count = 0
    var current = 'a'

    for (p in word.indices) {
        var move = abs(word[p] - current)
        if (move > 13) {
            move = 26 - move
        }
        count += move
        current = word[p]
    }

    return count + word.length
}