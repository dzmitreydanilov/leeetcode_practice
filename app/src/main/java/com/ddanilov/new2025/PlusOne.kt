package com.ddanilov.new2025

fun main() {
    val nums = intArrayOf(9)

    val result = plusOne(nums)


    result.forEach {
        println("XXX $it")
    }

}

/**
 *  434
 *
 *  439
 *  430
 *  440
 *
 * 499
 *
 * 490
 * 400
 * 500
 *
 *
 *
 */

private fun plusOne(digits: IntArray): IntArray {
    for (i in digits.lastIndex downTo 0) {
        if (digits[i] < 9) {
            digits[i] = digits[i] + 1
            return digits
        }

        digits[i] = 0
    }

    val newDigitsArray = IntArray(digits.size + 1)

    newDigitsArray[0] = 1

    return newDigitsArray
}