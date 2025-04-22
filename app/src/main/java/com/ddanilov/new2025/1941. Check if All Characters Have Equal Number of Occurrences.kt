package com.ddanilov.new2025

fun main() {
    val s = "abacbc"

    val result = areOccurrencesEqual(s)

    println(result)
}


/**
 * abacbc
 */
private fun areOccurrencesEqual(s: String): Boolean {
    val chars = IntArray(26)
    for (ch in s) {
        chars[ch-'a']++
    }
    var count = 0
    for (charCount in chars) {
        if (charCount == 0) {
            continue
        }
        if (count == 0) {
            count = charCount
        }
        if (count != charCount) {
            return false
        }
    }
    return true
}