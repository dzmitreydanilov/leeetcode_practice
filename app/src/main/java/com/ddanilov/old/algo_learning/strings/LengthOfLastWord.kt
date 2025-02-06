package com.ddanilov.algo_learning.strings

fun main() {
    val string = "   fly me   to   the moon  "
    val result = lengthOfLastWord(string)

    println(result)
}

// TC O(n)
// SC O(1)
private fun lengthOfLastWord(s: String): Int {
    var count = 0
    for (i in s.length - 1 downTo 0) {
        if (s[i] != ' ') {
            count++
        } else {
            if (count > 0) {
                return count
            }
        }
    }
    return count
}
