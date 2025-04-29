package com.ddanilov.new2025

fun main() {
    val nums = intArrayOf(0, 1, 0, 3, 12)

    moveZeroes(nums)

}

/**
 * 1, 3, 0, 0, 12
 *       l
 *              r
 * 1, 0, 0, 3, 12
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

    nums.forEach {
        println(it)
    }
}
