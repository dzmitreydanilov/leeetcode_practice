package com.ddanilov.revision

fun main() {
    val string1 = "anagram"
    val string2 = "nagaram"
    val result = isAnagram(string1, string2)

    println(result)
}

// TC O(N)
// SC O(N)
private fun isAnagram(s: String, t: String): Boolean {
    if (s.length != t.length) {
        return false
    }
    val countS = mutableMapOf<Char, Int>()
    val countT = mutableMapOf<Char, Int>()

    for (i in s.indices) {
        countS[s[i]] = 1 + (countS[s[i]] ?: 0)
        countT[t[i]] = 1 + (countT[t[i]] ?: 0)
    }

    return countS == countT
}
