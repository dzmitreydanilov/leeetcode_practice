package com.ddanilov.revision

fun main() {
    val haystack = "sadbutsad"
    val needle = "sad"
    val result = strStr(haystack, needle)

    println(result)

}

private fun strStr(haystack: String, needle: String): Int {
    // check if needle.length is bigger than haystack.length, means that hay stack doesn't contains needle substring
    if (haystack.length - needle.length < 0) return -1

    for (i in 0 until haystack.length + 1 - needle.length) {
        for (j in needle.indices) {
            if (haystack[i + j] != needle[j]) break

            if (j == needle.lastIndex) return i
        }
    }

    return  -1
}
