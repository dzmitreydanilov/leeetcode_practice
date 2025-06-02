package com.ddanilov.newchallange

fun main() {

    val word = arrayOf("Hello", "Alaska", "Dad", "Peace")

    val result = findWords(word)

    result.forEach {
        println(it)
    }
}

private fun findWords(words: Array<String>): Array<String> {
    val chartToRow = IntArray(26)

    for (c in "qwertyuiop") chartToRow[c - 'a'] = 1
    for (c in "asdfghjkl") chartToRow[c - 'a'] = 2
    for (c in "zxcvbnm") chartToRow[c - 'a'] = 3

    val result = mutableListOf<String>()

    for (w in words) {
        var sameRow = true
        val word = w.lowercase()
        val row = chartToRow[word[0] - 'a']

        for (i in 1 until word.length) {
            if (chartToRow[word[i] - 'a'] != row) {
                sameRow = false
                break
            }
        }

        if (sameRow) result.add(w)
    }

    return result.toTypedArray()
}