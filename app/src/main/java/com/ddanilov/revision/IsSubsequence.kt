package com.ddanilov.revision

fun main() {
    val s = "aec"
    val t = "abcde"
    val result = isSubsequence(s, t)

    println(result)
}

private fun isSubsequence(s: String, t: String): Boolean {
    var i = 0
    var j = 0

    while (i < s.length && j < t.length) {
        if (s[i] == t[j]) {
            i++
        }
        j++
    }

    return i == s.length
}
