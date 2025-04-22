package com.ddanilov.new2025

fun main() {
    val nums = intArrayOf(0, 0, 1, 1, 1, 2, 2, 3, 3, 4)

    val result = removeDuplicates(nums)

    println(result)
}


/**
 * 0, 1, 2, 3, 4, 2, 2, 3, 3, 4
 *             l
 *                            r
 *
 *
 * k
 */
private fun removeDuplicates(nums: IntArray): Int {
    var l = 1

    for (r in 1 until nums.size) {
        if (nums[r] != nums[r - 1]) {
            nums[l] = nums[r]
            l++
        }
    }

    return l
}
