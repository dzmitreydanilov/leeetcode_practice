package com.ddanilov.new2025.challange150

fun main() {
    val nums = intArrayOf(-1, 0, 3, 5, 9, 12)
    val target = 0

    val result = search(nums, target)

    println(result)

}

/**
 * -1, 0, 3, 5, 9, 12
 *  l
 *        m
 *                  r
 *
 *
 *  mid = (3 + 5) / 2 = 4
 */
private fun search(nums: IntArray, target: Int): Int {
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

    return -1
}