package com.ddanilov.newchallange

fun main() {
    val patterns = arrayOf("a", "abc", "bc", "d")
    val word = "abc"

    val result = numOfStrings(patterns, word)

    print(result)
}

private fun numOfStrings(patterns: Array<String>, word: String): Int {
    var count = 0

    patterns.forEach {
        if (word.contains(it)) count++
    }

    return count
}