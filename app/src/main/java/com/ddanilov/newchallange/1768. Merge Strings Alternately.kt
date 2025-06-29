package com.ddanilov.newchallange

fun main() {
    val word1 = "abc"
    val word2 = "pqr"

    val result = mergeAlternately(word1, word2)

    print(result)
}

private fun mergeAlternately(word1: String, word2: String): String {
    var i = 0

    var result = ""

    while (i < word1.length && i < word2.length) {
        result += word1[i]
        result += word2[i]
        i++
    }

    if (i < word1.length) {
        result += word1.substring(i, word1.length)
    }

    if (i < word2.length) {
        result += word2.substring(i, word2.length)
    }

    return result
}