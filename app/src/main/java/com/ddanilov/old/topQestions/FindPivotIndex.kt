package com.ddanilov.topQestions

fun main() {
    val nums = intArrayOf(1, 7, 3, 6, 5, 6)

    println(pivotIndex(nums))
}

private fun pivotIndex(nums: IntArray): Int {
    val totalSum = nums.sum() // 28
    var leftSum = 0

    for (i in nums.indices) {
        if (i != 0) leftSum += nums[i - 1]
        if (totalSum - leftSum - nums[i] == leftSum) return i
    }

    return -1
}
