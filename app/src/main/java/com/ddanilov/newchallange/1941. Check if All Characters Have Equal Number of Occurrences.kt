package com.ddanilov.newchallange

fun main() {

    val s = "abacbc"

    val result = areOccurrencesEqual(s)
    print(result)
}

private fun areOccurrencesEqual(s: String): Boolean {
    val map = mutableMapOf<Char, Int>()

    s.forEach {
        map[it] = map.getOrDefault(it, 0) + 1
    }

    return map.values.toSet().size == 1
}