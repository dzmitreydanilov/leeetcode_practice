package com.ddanilov.newchallange

import kotlin.math.max

fun main() {
    val nums = intArrayOf(1, 12, -5, -6, 50, 3)
    val k = 4

    val result = findMaxAverage(nums, k)
    print(result)
}


/**
 * 0   1   2  3    4  5
 * 1, 12, -5, -6, 50, 3
 *                 k
 *
 *
 */
private fun findMaxAverage(nums: IntArray, k: Int): Double {
    var sum = 0

    for (i in 0..k - 1) {
        sum += nums[i]
    }

    var maxSum = sum

    for (i in k until nums.size) {
        sum += nums[i] - nums[i - k]
        maxSum = maxOf(sum, maxSum)
    }

    return maxSum / k.toDouble()
}

