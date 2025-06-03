package com.ddanilov.newchallange

fun main() {
    val s = "A man, a plan, a canal: Panama"
    val result = isPalindrome(s)

    println(result)
}

/**
 * A man, a plan, a canal: Panama
 *                 l
 *                  r
 */

private fun isPalindrome(s: String): Boolean {
    var l = 0
    var r = s.lastIndex

    while (l <= r) {
        if (!isAlphaNumeric(s[l])) {
            l++
            continue
        }

        if (!isAlphaNumeric(s[r])) {
            r--
            continue
        }

        if (s[l].lowercase() != s[r].lowercase()) {
            return false
        }
        l++
        r--
    }
    return true
}

private fun isAlphaNumeric(char: Char): Boolean {
    val lowerCase = char in 'a'..'z'
    val upperCase = char in 'A'..'Z'
    val isDigit = char in '0'..'9'

    return lowerCase || upperCase || isDigit
}