package com.ddanilov.new2025.challange150

fun main() {
    val s = "race a car"

    val result = isPalindrome(s)

    println(result)
}

private fun isPalindrome(s: String): Boolean {
    var l = 0
    var r = s.lastIndex

    while (l >= r) {
        if (!s[l].isAlphaNumeric()) {
            l++
            continue
        }
        if (!s[r].isAlphaNumeric()) {
            r--
            continue
        }

        if (s[r].lowercase() != s[l].lowercase()) {
            return false
        }
        l++
        r--
    }

    return true
}

private fun Char.isAlphaNumeric(): Boolean {
    val isLower = this in 'a'..'z'
    val isUpper = this in 'A'..'Z'
    val isNumber = this in '0'..'9'

    return isLower || isUpper || isNumber
}