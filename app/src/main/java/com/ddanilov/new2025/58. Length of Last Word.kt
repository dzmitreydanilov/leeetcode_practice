package com.ddanilov.new2025

fun main() {
    val s = "a"
    val result = lengthOfLastWord(s)

    println(result)
}

/**
 * " Hello World  "
 *        l
 */
private fun lengthOfLastWord(s: String): Int {
    var result = 0

    for (i in s.lastIndex downTo 0) {
        if (s[i].isLetter()) {
            result++
        } else if (result > 0 && s[i].isWhitespace()) {
            return result
        }
    }

    return result
}
