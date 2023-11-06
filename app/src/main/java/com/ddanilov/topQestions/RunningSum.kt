package com.ddanilov.topQestions

fun main() {
    val nums = intArrayOf(1, 2, 3, 4)

    println(runningSum(nums).joinToString(" "))
}

private fun runningSum(nums: IntArray): IntArray {
    for (i in 1 until nums.size) {
        nums[i] += nums[i - 1]
    }

    return nums
}
