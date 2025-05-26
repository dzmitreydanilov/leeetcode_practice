package com.ddanilov.newchallange

fun main() {
    val digits = intArrayOf(4, 3, 2, 1)

    val result = plusOne(digits)

    result.forEach {
        println(it)
    }
}

/**
 * 4, 3, 2, 1 -> 4, 3, 2, 2
 * 4 2 9 -> 4 3 0
 * 4 9 9 -> 5 0 0
 * 9 9 9 -> 1 0 0 0
 */
private fun plusOne(digits: IntArray): IntArray {

    for (d in digits.lastIndex downTo 0) {
        if (digits[d] < 9) {
            digits[d] += 1
            return digits
        }
        digits[d] = 0
    }

    val newDigitsArray = IntArray(digits.size + 1)
    newDigitsArray[0] = 1
    return newDigitsArray
}