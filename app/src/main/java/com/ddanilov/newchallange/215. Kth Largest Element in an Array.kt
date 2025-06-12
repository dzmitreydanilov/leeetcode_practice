package com.ddanilov.newchallange

import java.util.Arrays

fun main() {
    val nums = intArrayOf(3, 2, 1, 5, 6, 4)
    val k = 2

    val result = findKthLargest(nums, k)

    println(result)
}

private fun findKthLargest(nums: IntArray, k: Int): Int {
    Arrays.sort(nums)

    return nums[nums.size - k]
}