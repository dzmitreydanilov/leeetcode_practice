package com.ddanilov.new2025

fun main() {

    val nums = intArrayOf(0, 0, 1, 1, 1, 2, 2, 3, 3, 4)

    val result = removeDuplicates(nums)

    println("XXXX $result")
}

/**
 * 0, 1, 3, 5, 6, 8, 10, 8, 10, 10
 *                       l
 *                              r
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