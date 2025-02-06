package com.ddanilov.revision

fun main() {
    val number = 12321
    isPalindrome(number)
}

private fun isPalindrome(x: Int): Boolean {
    if (x == 0) return true

    if (x < 0 || x % 10 == 0) {
        return false
    }

    var value = x
    var reversedInt = 0

    while (value > reversedInt) {
        //get last digit
        val pop = value % 10
        println("pop $pop")
        // remove last digit
        value /= 10
        println("value $value")

        reversedInt = (reversedInt * 10) + pop
    }

    println("reversedInt $reversedInt")
    println("reversedInt / 10 ${reversedInt / 10}")
    println("value $value")
    println("value == reversedInt ${value == reversedInt}")
    println("value == reversedInt / 10 ${value == reversedInt / 10}")

    // we need to check value == reversedInt / 10 for number with odd numbers for example 12321
    return value == reversedInt || value == reversedInt / 10
}
