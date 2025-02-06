package com.ddanilov.algo_learning.arrays

fun main() {
    val helloString = "Hello Dima"
//    val result = reverseString(helloString)
    val result = reverseString1(helloString)

    println(result)
}

private fun reverseString(string: String): String {
    return string.reversed()
}

private fun reverseString1(string: String): String {
    val length = string.length - 1
    val reversedString: MutableList<Char> = mutableListOf()
    for(i in length downTo 0 ) {
        reversedString.add(string[i])
    }

    return reversedString.joinToString("")
}
