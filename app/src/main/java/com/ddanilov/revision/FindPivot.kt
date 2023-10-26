package com.ddanilov.revision

fun main() {
    val nums = intArrayOf(1, 7, 3, 6, 5, 6)
    val result = pivotIndex(nums)

    println(result)
}

private fun pivotIndex(nums: IntArray): Int {
    var totalSum = 0
    nums.forEach {
        totalSum += it
    }
    var leftSum = 0
    for (i in nums.indices) {
        if (i != 0) leftSum += nums[i - 1]
        if (totalSum - leftSum - nums[i] == leftSum) {
            return i
        }
    }
    return -1
}
