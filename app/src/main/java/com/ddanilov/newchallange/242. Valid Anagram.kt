package com.ddanilov.newchallange

import java.util.Arrays

fun main() {
    val s = "anagram"
    val t = "nagaram"

    val result = isAnagramBrut(s, t)

    println(result)
}

private fun isAnagramBrut(s: String, t: String): Boolean {
    if (s.length != t.length) return false

    val alphabet = IntArray(26)

    for (i in s.indices) {
        alphabet[s[i] - 'a']++
        alphabet[t[i] - 'a']--
    }

    return alphabet.all { it == 0 }
}
