package com.ddanilov.cadence2.arrays

fun main() {
    val nums = intArrayOf(1, 3, 5, 6)
    val target = 2

    val result = searchInsert(nums, target)

    println(result)
}

/**
 * 1, 3, 5, 6
 *   l
 * r
 *
 * m
 *
 *
 * t = 2
 */

private fun searchInsert(nums: IntArray, target: Int): Int {
    var l = 0
    var r = nums.lastIndex

    while (l <= r) {
        val mid = (l + r) / 2

        if (nums[mid] == target) {
            return mid
        }

        if (nums[mid] < target) {
            l = mid + 1
        } else {
            r = mid - 1
        }
    }

    return l
}