package com.ddanilov.algo_learning.arrays

fun main() {
    val digits = intArrayOf(9, 9, 9)
    val result = plusOne(digits)

    println(result.joinToString(""))
}

// TC O(n)
//SC O(n)
private fun plusOne(digits: IntArray): IntArray {
    for (i in digits.size - 1 downTo 0) {
        if (digits[i] < 9) {
            digits[i]++
            return digits
        }

        digits[i] = 0
    }
    val newArray = IntArray(digits.size + 1)
    newArray[0] = 1
    return newArray
}
