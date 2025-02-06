package com.ddanilov.topQestions

fun main() {
    val haystack = "sadbutsad"
    val needle = "sad"

    println(strStr(haystack, needle))
}


private fun strStr(haystack: String, needle: String): Int {
    if (haystack.length - needle.length < 0) return -1

    for (i in 0 until haystack.length - needle.length + 1)
        for (j in needle.indices) {
            if (haystack[i + j] != needle[j]) break
            if (j == needle.lastIndex) return i
        }
    return -1
}
