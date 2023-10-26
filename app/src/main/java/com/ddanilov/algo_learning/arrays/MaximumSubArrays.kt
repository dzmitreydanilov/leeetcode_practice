package com.ddanilov.algo_learning.arrays

import kotlin.math.max

//Given an integer array nums, find the subarray with the largest sum, and return its sum.
fun main() {
    val array = intArrayOf(-2, 2, 5, -11, 6)
    val result = maxSubArray(array)

    println(result)
}

fun maxSubArray(nums: IntArray): Int {
    var maxSum = Int.MIN_VALUE
    var currentSum = 0


    nums.forEach {
        currentSum = maxOf(currentSum + it, it)
        maxSum = maxOf(currentSum, maxSum)
    }
    return maxSum
}

// TC O(n^2)
private fun maxSubArray1(nums: IntArray): Int {
    var max = Int.MIN_VALUE

    for (i in nums.indices) {
        var currentMax = 0
        for (j in i until nums.size) {
            currentMax += nums[j]
            max = maxOf(currentMax, max)
        }
    }

    return max
}
