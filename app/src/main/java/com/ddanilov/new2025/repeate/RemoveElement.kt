package com.ddanilov.new2025.repeate

fun main() {
    val nums = intArrayOf(3, 2, 2, 3)
    val k = 3

    val result = removeElement(nums, k)
}

/**
 * 2,2, 3, 3
 *    l
 *        r
 */

private fun removeElement(nums: IntArray, `val`: Int): Int {
    var k = 0

    for (i in nums.indices) {
        if (nums[i] != `val`) {
            val temp = nums[k]
            nums[k] = nums[i]
            nums[i] = temp
            k++
        }
    }
    return k
}
