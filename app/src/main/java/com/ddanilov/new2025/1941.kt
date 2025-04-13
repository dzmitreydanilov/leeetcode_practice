package com.ddanilov.new2025

fun main() {
    val s = "abacbc"
    val result = areOccurrencesEqual(s)

    println("XXX $result")
}

/**
 * abacbc
 *
 * {
 * a: 1
 * b: 1
 * c: 1
 *
 * 
 * }
 *
 *
 *
 */

private fun areOccurrencesEqual(s: String): Boolean {
    val charMap = mutableMapOf<Char, Int>()

    s.forEach {
        charMap[it] = charMap.getOrDefault(it, 0) + 1
    }

    return charMap.values.toSet().size == 1
}
