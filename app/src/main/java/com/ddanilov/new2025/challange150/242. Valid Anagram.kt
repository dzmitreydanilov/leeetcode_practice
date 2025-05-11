package com.ddanilov.new2025.challange150

fun main() {
    val s = "anagram"
    val t = "nagaram"

    val result = isAnagram(s, t)

    println(result)
}

/**
 * anagram
 * nagaram
 */
private fun isAnagram(s: String, t: String): Boolean {
    if (s.length != t.length) return false
    val charArray = IntArray(26)

    for (i in s.indices) {
        charArray[s[i] - 'a']++
        charArray[t[i] - 'a']--
    }

    charArray.forEach {
        if (it != 0) return false
    }

    return true
}