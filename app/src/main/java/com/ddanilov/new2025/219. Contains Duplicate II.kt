package com.ddanilov.new2025

fun main() {
    val nums = intArrayOf(1, 0, 1, 1)
    val k = 1

    val result = containsNearbyDuplicate(nums, k)

    println(result)
}

/**
 * 1, 0, 1, 1
 *       l
 *          r
 *
 * [1]
 * k = 1
 */
private fun containsNearbyDuplicate(nums: IntArray, k: Int): Boolean {
    var l = 0
    val set = mutableSetOf<Int>()

    for (r in nums.indices) {
        if (r - l > k) {
            set.remove(nums[l])
            l++
        }
        if (set.contains(nums[r])) {
            return true
        } else {
            set.add(nums[r])
        }
    }
    return false
}