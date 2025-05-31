package com.ddanilov.newchallange

fun main() {
    val nums = intArrayOf(1, 2, 3, 4, 1, 3)
    val k = 3

    val result = containsNearbyDuplicate(nums, k)

    println(result)
}


/**
 * 1, 2, 3, 4, 1, 3
 *       l
 *                r
 *
 * [3,4,1]
 *
 */
private fun containsNearbyDuplicate(nums: IntArray, k: Int): Boolean {
    var l = 0
    val seen = mutableSetOf<Int>()

    for (r in nums.indices) {
        if (r - l > k) {
            seen.remove(nums[l])
            l++
        }

        if (seen.contains(nums[r])) {
            return true
        } else {
            seen.add(nums[r])
        }
    }

    return false
}