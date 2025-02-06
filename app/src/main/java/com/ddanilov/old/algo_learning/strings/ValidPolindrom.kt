package com.ddanilov.algo_learning.strings

fun main() {
    val string = "A man, a plan, a canal: Panama"
    val result = isPalindrome(string)

    println(result)
}

private fun isPalindrome(s: String): Boolean {
    var fixedString = ""
    for (char in s) {
        if (char.isDigit() || char.isLetter()) {
            fixedString += char
        }
    }
    val lowerCaseString = fixedString.lowercase()
    var pointerA = 0
    var pointerB = lowerCaseString.length - 1

    while (pointerA <= pointerB) {
        if (lowerCaseString[pointerA] != lowerCaseString[pointerB]) {
            return false
        }
        pointerA++
        pointerB--
    }
    return true
}
