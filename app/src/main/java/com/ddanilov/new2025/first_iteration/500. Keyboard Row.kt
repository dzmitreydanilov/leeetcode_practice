package com.ddanilov.new2025.first_iteration

fun main() {
    val words = arrayOf("Hello", "Alaska", "Dad", "Peace")

    val result = findWords(words)

    result.forEach {
        println(it)
    }
}

private fun findWords(words: Array<String>): Array<String> {
    val charToRow = IntArray(26) // 'a' to 'z'

    // Fill row mapping
    for (c in "qwertyuiop") charToRow[c - 'a'] = 1
    for (c in "asdfghjkl") charToRow[c - 'a'] = 2
    for (c in "zxcvbnm") charToRow[c - 'a'] = 3

    val result = ArrayList<String>()

    for (word in words) {
        val lower = word.lowercase()
        val row = charToRow[lower[0] - 'a']
        var sameRow = true

        for (i in 1 until lower.length) {
            if (charToRow[lower[i] - 'a'] != row) {
                sameRow = false
                break
            }
        }

        if (sameRow) result.add(word)
    }

    return result.toTypedArray()
}