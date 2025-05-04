package com.ddanilov.new2025.repeate

fun main() {
    val haystack = "sadbutsad"
    val needle = "bad"
    val result = strStr(haystack, needle)

    println(result)
}

/**
 * mississippi
 *  i
 * issipi
 *  j
 */
private fun strStr(haystack: String, needle: String): Int {
    if (haystack.length < needle.length) return -1

    main@ for (i in 0 until haystack.length + 1 - needle.length) {
        if (haystack[i] == needle[0]) {
            for (j in 1 until needle.length) {
                if (haystack[i + j] != needle[j]) {
                    continue@main
                }
            }
            return i
        }
    }
    return -1
}
