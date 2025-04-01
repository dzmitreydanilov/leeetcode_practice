package com.ddanilov.new2025

fun main() {
    val nums = intArrayOf(1, 3, 5, 6)
    val target = 5
    val result = searchInsert(nums, target)

    println("XXX result: $result")
}

/**
 *
 * target = 5
 * [1, 3, 5, 6]
 *  l  m     r
 *
 *  m = (0 + 3) / 2 (1)
 */

private fun searchInsert(nums: IntArray, target: Int): Int {
    var l = 0
    var r = nums.size - 1

    while (l <= r) {
        val midI = (l + r) / 2

        if (nums[midI] == target) {
            return midI
        }

        if (target > nums[midI]) {
            l = midI + 1
        } else {
            r = midI - 1
        }
    }

    return l
}