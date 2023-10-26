package com.ddanilov.algo_learning.strings

fun main() {
    val haystack = "leetcode"
    val needle = "leeto"
    val result = strStr(haystack, needle)

    println(result)
}

private fun strStr(haystack: String, needle: String): Int {
    val length = haystack.length - needle.length
    if (length < 0) return -1

    for (i in 0..length) {
        var j = 0
        while (j < needle.length && haystack[i + j] == needle[j]) {
            j++
        }

        if (j == needle.length) return i
    }

    return -1
}
