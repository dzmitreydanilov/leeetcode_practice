package com.ddanilov.new2025

fun main() {
    val digits = intArrayOf(9, 9, 9)
    val result = plusOne(digits)

    result.forEach {
        println(it)
    }
}

/**
 * 1, 3, 0
 * 1,9,9 ->    1,0,0,0
 */
private fun plusOne(digits: IntArray): IntArray {

    for (i in digits.lastIndex downTo 0) {
        if (digits[i] != 9) {
            digits[i] = digits[i] + 1
            return digits
        }

        digits[i] = 0
    }

    val result = IntArray(digits.size + 1) { 0 }
    result[0] = 1

    return result
}