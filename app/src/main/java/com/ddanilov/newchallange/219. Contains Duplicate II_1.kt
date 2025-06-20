package com.ddanilov.newchallange

import kotlin.math.abs

fun main() {
    val nums = intArrayOf(1, 2, 3, 1, 2, 3)
    val k = 2

    val result = containsNearbyDuplicate(nums, k)

    print(result)
}

/**
 * 1, 2, 3, 1, 2, 3
 * l
 * r
 *
 *
 * k =
 *
 * []
 */

private fun containsNearbyDuplicate(nums: IntArray, k: Int): Boolean {
    val seen = mutableSetOf<Int>()
    var l = 0
    var r = 0

    while (r < nums.size) {
        if(abs(l - r) > k) {
            seen.remove(nums[l])
            l++
        }

        if(seen.contains(nums[r])) {
            return true
        } else {
            seen.add(nums[r])
        }
        r++
    }
    return false
}