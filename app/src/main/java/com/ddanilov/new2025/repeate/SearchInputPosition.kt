package com.ddanilov.new2025.repeate

fun main() {
    val nums = intArrayOf(1, 3, 5, 6)
    val target = 5

    val result = searchInsert(nums, target)


    println("XXXX $result")
}

/**
 * 1, 3, 5, 6
 *
 * l        r
 *
 */
private fun searchInsert(nums: IntArray, target: Int): Int {
    var l = 0
    var r = nums.lastIndex

    while (l <= r) {
        val mid = (l + r) / 2

        if (target == nums[mid]) {
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