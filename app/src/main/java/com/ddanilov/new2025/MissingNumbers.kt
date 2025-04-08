package com.ddanilov.new2025

fun main() {
    val nums = intArrayOf(0, 1)

    val result = missingNumber2(nums)

    println("XXXX $result")
}

/**
 * 0, 1
 *
 */
private fun missingNumberBrut(nums: IntArray): Int {
    var current = 0
    while (current <= nums.size) {
        if (!nums.contains(current)) {
            return current
        }
        current++
    }
    return 0
}

private fun missingNumber(nums: IntArray): Int {
    val sumOfAllNums = (nums.size * (nums.size + 1)) / 2

    var result = sumOfAllNums

    nums.forEach {
        result -= it
    }

    return result
}

private fun missingNumber2(nums: IntArray): Int {
    var xorResult = 0

    for (i in 0..nums.size) {
        xorResult = xorResult xor i
    }

    for (num in nums) {
        xorResult = xorResult xor num
    }

    return xorResult
}