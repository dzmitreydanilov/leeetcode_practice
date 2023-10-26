package com.ddanilov.topQestions

import kotlin.math.max

fun main() {
    val nums = intArrayOf(1, 2, 3)

    println(maximumProduct(nums))
}

private fun maximumProduct(nums: IntArray): Int {
    val size = nums.size
    nums.sort()
    val max = nums[size - 1] * nums[size - 2] * nums[size - 3]
    val maxInCaseNegative = nums[1] * nums[0] * nums[size - 1]
    return maxOf(max, maxInCaseNegative)
}
