package com.ddanilov.revision

fun main() {
    val pattern = "abba"
    val s = "dog cat cat dog"
    val result = wordPattern(pattern, s)
    println(result)
}

private fun wordPattern(pattern: String, s: String): Boolean {
    val map = HashMap<Char, String>()
    val words = s.split(" ")
    if (pattern.length != words.size) return false

    for (i in pattern.indices) {
        val currentChar = pattern[i]
        if (map.contains(currentChar)) {
            if (map[currentChar]!! != words[i]) return false
        } else {
            if (map.containsValue(words[i])) return false
            map[currentChar] = words[i]
        }
    }

    return true
}
