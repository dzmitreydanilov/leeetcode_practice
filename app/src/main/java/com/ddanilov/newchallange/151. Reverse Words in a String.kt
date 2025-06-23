package com.ddanilov.newchallange

fun main() {
    val s = " the sky is blue "
    val result = reverseWords(s)

    print(result)
}


/**
 * "the   sky is blue"
 *  l               r
 *  "blue is sky the
 */
private fun reverseWords(s: String): String {
    val words = s.trim().split(" ")
    if (words.size == 1) return words.first()

    val result = mutableListOf<String>()
    for (i in words.lastIndex downTo 0) {
        result.add(words[i])
    }

    return result.joinToString(" ")
}