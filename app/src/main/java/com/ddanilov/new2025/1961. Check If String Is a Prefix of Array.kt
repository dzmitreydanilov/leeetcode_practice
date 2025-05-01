package com.ddanilov.new2025

fun main() {
    val s = "iloveleetcode"
    val words = arrayOf("i", "love", "leetcode", "apples")

    val result = isPrefixString(s, words)

    println(result)
}

/**
 * ["i", "love", "leetcode", "apples"]
 */
private fun isPrefixString(s: String, words: Array<String>): Boolean {

    var concatenated = ""

    words.forEach {
        concatenated += it

        if (concatenated == s) {
            return true
        }

        if (concatenated.length > s.length) {
            return false
        }
    }
    return false
}
