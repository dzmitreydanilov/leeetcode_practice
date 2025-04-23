package com.ddanilov.new2025.first_iteration

fun main() {
    val s = "MCMXCIV"

    val result = romanToInt(s)

    println(result)
}

/**
 * LVIII
 *
 */
private fun romanToInt(s: String): Int {
    var result = 0
    var pointer = 0

    while (pointer <= s.length) {
        val current = romanToIntMap[s[pointer]]!!
        if (pointer + 1 == s.length) {
            result += current
            return result
        }
        val next = romanToIntMap[s[pointer + 1]]!!
        if (current < next) {
            result -= current
        } else {
            result += current
        }
        pointer++
    }

    return result
}

private var romanToIntMap: Map<Char, Int> = mapOf(
    'I' to 1,
    'V' to 5,
    'X' to 10,
    'L' to 50,
    'C' to 100,
    'D' to 500,
    'M' to 1000
)
