package com.ddanilov.revision

fun main() {
    val haystack = "hello"
    val needle = "ll"
    val result = strStr(haystack, needle)
}


private fun strStr(haystack: String, needle: String): Int {
    if(haystack.length - needle.length < 0) return -1

    for(i in 0 until haystack.length + 1 - needle.length) {
        for(j in needle.indices) {
            if(haystack[i + j] != needle[j]) break
            if(j == needle.lastIndex) return i
        }
    }

    return -1
}
