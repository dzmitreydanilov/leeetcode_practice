package com.ddanilov.new2025

fun main() {
    val s = "A man, a plan, a canl: Panama?"

    val result = isPalindrome(s)

    println(result)

}

/**
 * "A man, a plan, a canal: Panama?"
 *  l
 *                                r
 *
 */
private fun isPalindrome(s: String): Boolean {
    var l = 0
    var r = s.lastIndex

    while (l < r) {
        if (!s[l].isAlphaNumeric()) {
            l++
            continue
        }
        if (!s[r].isAlphaNumeric()) {
            r--
            continue
        }
        if (s[l].lowercaseChar() != s[r].lowercaseChar()) {
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
    val isDigit = this  in '0'..'9'

    return isLower || isUpper || isDigit
}