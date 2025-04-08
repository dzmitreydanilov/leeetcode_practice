package com.ddanilov.new2025.repeate

fun main() {
    val nums = intArrayOf(0, 1, 0, 3, 12)

    moveZeroes(nums)
}

/**
 * 1, 3, 12, 0, 0
 *       l
 *             r
 */
private fun moveZeroes(nums: IntArray): Unit {
    var l = 0

    for (r in nums.indices) {
        if (nums[r] != 0) {
            val temp = nums[l]
            nums[l] = nums[r]
            nums[r] = temp
            l++
        }
    }
}