package com.ddanilov.newchallange

fun main() {
    val x = 121

    val result = isPalindrome(x)

    println(result)
}

/**
 * 12212
 *
 * div = 100  000 000
 *
 * 122 211  >= 100 000*10
 * div = 10 000*10
 *
 * e: 122 211 % 10 = 1
 * s: 122 211 / 100 000 = 1
 *
 * if(
 *
 */
private fun isPalindrome(x: Int): Boolean {
        if (x < 0) return false
        var div = 1L
        var newNumber = x.toLong()

        while (newNumber >= div * 10) {
            div *= 10
        }

        while (newNumber > 0) {
            val start = newNumber / div
            val end = newNumber % 10

            if (start != end) return false

            newNumber = (newNumber % div) / 10
            div /= 100
        }

        return true
}