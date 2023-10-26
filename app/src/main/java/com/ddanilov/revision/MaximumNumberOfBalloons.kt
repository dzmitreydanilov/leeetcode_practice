package com.ddanilov.revision

fun main() {
    val text = "loonbalxballpoon"
    val res = maxNumberOfBalloons(text)
    println(res)
}

private fun maxNumberOfBalloons(text: String): Int {
    val charArray = IntArray(26)
    for (i in text.indices) {
        charArray[text[i] - 'a']++
    }
    var min = charArray[1] //b
    min = minOf(min, charArray[0]) //a
    min = minOf(min, charArray[11] / 2) //l
    min = minOf(min, charArray[14] / 2) // o
    min = minOf(min, charArray[13]) // n
    return min
}
