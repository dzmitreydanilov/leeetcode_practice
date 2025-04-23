package com.ddanilov.new2025.first_iteration

fun main() {
    val nums = intArrayOf(1, 3, 5, 6)

    val target = 4

    val result = searchInsert(nums, target)

    println(result)
}

/**
 * 1, 3, 5, 6
 *       l
 *
 *    r
 * t = 4
 */
private fun searchInsert(nums: IntArray, target: Int): Int {
    var (l, r) = 0 to nums.lastIndex

    while (l <= r) {
        val mid = (r + l) / 2

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