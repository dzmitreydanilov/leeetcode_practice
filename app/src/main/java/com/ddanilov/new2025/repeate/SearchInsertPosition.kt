package com.ddanilov.new2025.repeate

fun main() {
    val nums = intArrayOf(1, 3, 5, 6)
    val target = 2

    val result = searchInsert(nums, target)

    println("XXXX $result")
}

/**
 * 1, 3, 5, 6, 7
 */

private fun searchInsert(nums: IntArray, target: Int): Int {
    var l = 0
    var r = nums.lastIndex

    while (l <= r) {
        val mid = (l + r) / 2

        if (nums[mid] == target) {
            return mid
        }

        if (nums[mid] > target) {
            r = mid - 1
        } else {
            l = mid + 1
        }
    }

    return l
}