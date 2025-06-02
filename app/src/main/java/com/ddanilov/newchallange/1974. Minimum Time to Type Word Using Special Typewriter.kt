package com.ddanilov.newchallange

import kotlin.math.abs

fun main() {
    val word = "bza"
    val result = minTimeToType(word)

    print(result)
}

private fun minTimeToType(word: String): Int {
    var result = 0
    var start = 'a'
    word.forEach { char ->
        val diff = abs(start - char)
        result += if (diff <= 13) {
            diff
        } else {
            26 - diff
        }
        start = char
    }

    return result + word.length
}