package com.ddanilov.new2025.repeate

fun main() {
    val nums = intArrayOf(1,2)
    val target = 3

    val result = searchInsert(nums, target)

    println("XXX $result")
}

/**
 * 1, 2
 *    l
 *    m
 *    r
 *
 *
 * m = (0 + 1) / 2 = 0
 * 3 > 1
 *
 * m = (1 + 1) /2 = 1
 * 3 > 2
 */

private fun searchInsert(nums: IntArray, target: Int): Int {
    var l = 0
    var r = nums.lastIndex

    while (l <= r) {
        val mid = (l + r) / 2

        if (nums[mid] == target) {
            return mid
        }

        if (target > nums[mid]) {
            l = mid + 1
        } else {
            r = mid - 1
        }
    }

    return l
}

