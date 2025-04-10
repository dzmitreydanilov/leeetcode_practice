package com.ddanilov.new2025

fun main() {
    val s = "abacbc"
    val result = areOccurrencesEqual(s)

    println("XXX $result")
}

/**
 *
 */
fun areOccurrencesEqual(s: String): Boolean {
    val map = mutableMapOf<Char, Int>()
    s.forEach {
        map[it] = map.getOrDefault(it, 0) + 1
    }

    return HashSet<Int>(map.values).size == 1
}
