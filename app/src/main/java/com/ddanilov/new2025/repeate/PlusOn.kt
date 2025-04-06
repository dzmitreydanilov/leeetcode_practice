package com.ddanilov.new2025.repeate

fun main() {

    val nums = intArrayOf(9, 9, 9)

    val result = plusOne(nums)

    result.forEach {
        println("XXX $it")
    }

}

/**
 * 1, 2, 3 -> 1, 2, 4
 *
 * 1, 2, 9 ->  1, 2, 0 -> 1, 3, 0
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

    val newArray = IntArray(digits.size + 1)
    newArray[0] = 1

    return newArray
}