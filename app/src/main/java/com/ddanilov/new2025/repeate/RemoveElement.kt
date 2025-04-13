package com.ddanilov.new2025.repeate

fun main() {
    val nums = intArrayOf(3, 2, 2, 3)
    val elementToRemove = 3

    val result = removeElement(nums, elementToRemove)
}

/**
 * 2, 2, 3, 3
 *       l
 *            r
 */

private fun removeElement(nums: IntArray, `val`: Int): Int {
    var l = 0
    for (r in nums.indices) {
        if (nums[r] != `val`) {
            val temp = nums[l]
            nums[l] = nums[r]
            nums[r] = temp
            l++
        }
    }

    return l
}