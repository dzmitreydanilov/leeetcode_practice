package com.ddanilov.new2025

fun main() {
    val nums = intArrayOf(3, 0, 1)
    val result = missingNumber(nums)
    println(result)
}

/**
 * 3, 0, 1
 *
 * -3, 0, -1
 */
private fun missingNumber(nums: IntArray): Int {
    var sum = (nums.size * (nums.size + 1)) / 2

    nums.forEach {
        sum -= it
    }

    return sum
}
