package com.ddanilov.newchallange

fun main() {
    val s = "iloveleetcode"
    val words = arrayOf("i", "love", "leetcode", "apples")
    val result = isPrefixString(s, words)

    println(result)
}

/**
 *
 *
 *
 */
private fun isPrefixString(s: String, words: Array<String>): Boolean {
    var concatinated = ""

    words.forEach {
        concatinated += it

        if (concatinated == s) {
            return true
        }

        if (concatinated.length > s.length) {
            return false
        }
    }

    return false
}