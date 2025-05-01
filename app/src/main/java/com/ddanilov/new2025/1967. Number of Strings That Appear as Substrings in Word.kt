package com.ddanilov.new2025

fun main() {
    val patterns = arrayOf("a", "abc", "bc", "d")
    val word = "abc"
    val result = numOfStrings(patterns, word)

    println(result)
}

/**
 * bc
 *  i
 * abc
 *   r
 */
private fun numOfStrings(patterns: Array<String>, word: String): Int {
    return patterns.count { word.contains(it) }
}