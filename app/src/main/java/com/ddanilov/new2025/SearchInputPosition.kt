package com.ddanilov.new2025

fun main() {

    val nums = intArrayOf(1, 3, 5, 6)
    val target = 6

    val result = searchInsert(nums, target)

    println("XXXX $result")

}

/**
 * 1, 3, 5, 7
 *
 *          l
 *       r
 *
 * m = 2
 *
 */

private fun searchInsert(nums: IntArray, target: Int): Int {
    var l = 0
    var r = nums.size - 1

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