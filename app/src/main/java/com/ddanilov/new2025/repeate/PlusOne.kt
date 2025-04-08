package com.ddanilov.new2025.repeate

fun main() {
    val digits = intArrayOf(1, 2, 3)

    val result = plusOne(digits)

    result.forEach {
        print("$it, ")
    }
}

/**
 *  1,2,3 -> 1,2,4
 *
 *
 *  9,9,9 -> 1, 0, 0 ,0
 *
 *  2,3,9 -> 2,4,0
 */
private fun plusOne(digits: IntArray): IntArray {
    for (i in digits.lastIndex downTo 0) {
        if (digits[i] < 9) {
            digits[i] = digits[i] + 1
            return digits
        }

        digits[i] = 0
    }

    val newArray = IntArray(size = digits.size + 1)
    newArray[0] = 1
    return newArray
}
