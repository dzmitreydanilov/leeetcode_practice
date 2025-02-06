package com.ddanilov.algo_learning

fun main() {
    val inputValue = 121
    val result = isPalindrome(inputValue)

    println(result)
}

private fun isPalindrome(x: Int): Boolean {
    if (x == 0) {
        return true
    }

    if (x < 0 || x % 10 == 0) {
        return false
    }
    var value = x
    var reversedInt = 0
    while (value > reversedInt) {
        val pop = value % 10
        value /= 10
        reversedInt = (reversedInt * 10) + pop
        println(reversedInt)
    }
    println(value)
    return value == reversedInt || value == reversedInt / 10
}
//121
/**
 * pop = 1
 * value = 12
 * reversedInt = 1
 *
 * pop = 2
 * value = 1
 * reversedInt = 12
 *
 * pop = 1
 * value = 0
 * reversedInt = 121
 *
 *
 * value = 0  reversedInt = 121
 *
 * value = 0 reversedInt = 12
 */
// 2222
/**
 * pop = 2
 *  value = 222
 *  reversed = 2
 *
 *  pop = 2
 *  value = 22
 *  reversed = 22
 *
 *  2 == 22
 *
 *  true
 */
