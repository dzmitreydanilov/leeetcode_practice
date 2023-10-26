package com.ddanilov.revision

fun main() {
    val s = "Hello World"
    val result = lengthOfLastWord(s)

    println(result)

}

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
