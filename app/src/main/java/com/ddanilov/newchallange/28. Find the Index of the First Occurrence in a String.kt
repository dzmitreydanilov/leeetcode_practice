package com.ddanilov.newchallange

fun main() {
    val haystack = "butsad"
    val needle = "sad"

    val result = strStr(haystack, needle)

    print(result)
}

/**
 * butsad
 * i
 * sad
 * j
 *
 * 3 + 0 = s s
 * 3 + 1 = a a
 * 3 + 2 = d d
 */
private fun strStr(haystack: String, needle: String): Int {
    for (i in 0..haystack.length - needle.length) {
        var match = true
        for (j in needle.indices) {
            if (haystack[i + j] != needle[j]) {
                match = false
                break
            }
        }
        if (match) return i
    }
    return -1
}