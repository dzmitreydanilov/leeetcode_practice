package com.ddanilov.topQestions

fun main() {
    val nums = intArrayOf(1, 2, 3) // 999
    println(plusOne(nums).joinToString(" "))
}

private fun plusOne(digits: IntArray): IntArray {
    for (i in digits.lastIndex downTo 0) {
        if (digits[i] < 9) {
            digits[i]++
            return digits
        }
        digits[i] = 0
    }

    return intArrayOf(1) + digits
}
