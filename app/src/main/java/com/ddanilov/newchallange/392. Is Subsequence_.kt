package com.ddanilov.newchallange

import kotlin.io.path.Path

fun main() {
    val s = "ab"
    val t = "baab"

    val result = isSubsequence(s, t)

    println(result)
}

/**
 *  axc
 *   i
 *
 *  ahbgdc
 *        j
 *
 */
private fun isSubsequence(s: String, t: String): Boolean {
    var i = 0
    var j = 0

    while (i < s.length && j < t.length) {
        if (s[i] == t[j]) {
            i++
            j++
        } else {
            j++
        }
    }

    return i == s.length
}