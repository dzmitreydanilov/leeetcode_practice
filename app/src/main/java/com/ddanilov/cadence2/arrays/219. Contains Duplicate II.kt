package com.ddanilov.cadence2.arrays

import kotlin.math.abs

fun main() {
    val nums = intArrayOf(1, 2, 3, 1)
    val k = 3

    val result = containsNearbyDuplicate(nums, k)

    println(result)

}

/**
 * 1, 2, 3, 1
 *    l
 *       r
 *
 */

private fun containsNearbyDuplicate(nums: IntArray, k: Int): Boolean {
    var l = 0
    var r = 0
    val seen = mutableSetOf<Int>()

    while (r < nums.size) {
        if (abs(l - r) > k) {
            seen.remove(nums[l])
            l++
        }

        if (seen.contains(nums[r])) {
            return true
        } else {
            seen.add(nums[r])
        }
        r++
    }

    return false
}