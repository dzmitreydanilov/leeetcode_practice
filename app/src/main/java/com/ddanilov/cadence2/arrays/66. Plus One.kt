package com.ddanilov.cadence2.arrays

fun main() {
    val digits = intArrayOf(1, 0, 9, 9, 9)

    val result = plusOne(digits)

    result.forEach {
        println(it)
    }
}

/**
 * 1,2,3 -> 124
 * 9,9,9 -> 1000
 * 999
 *  1. 990
 *  2.900
 *  3.1000
 * 1099 -> 1100
 * 1. 1090
 * 2. 1000
 * 3. 1100
 */

private fun plusOne(digits: IntArray): IntArray {
    for (i in digits.lastIndex downTo 0) {
        if (digits[i] < 9) {
            digits[i] = digits[i] + 1
            return digits
        }

        digits[i] = 0
    }

    return intArrayOf(1) + digits
}