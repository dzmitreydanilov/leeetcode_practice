package com.ddanilov.new2025

fun main() {
    val haystack = "sabutsad"
    val needle = "sad"

    val result = strStr(haystack, needle)

    println(result)
}

/**
 * sabutsad
 *   h
 * sad
 *   n
 */
private fun strStr(haystack: String, needle: String): Int {
    if (haystack.length < needle.length) return -1
    val len = needle.length

    main@ for (i in 0..haystack.length - len) {
        if (haystack[i] == needle[0]) {
            for (j in 1 until len) {
                if (haystack[i + j] != needle[j]) {
                    continue@main
                }
            }
            return i
        }
    }

    return -1
}