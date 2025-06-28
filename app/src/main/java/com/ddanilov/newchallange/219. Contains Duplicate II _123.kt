package com.ddanilov.newchallange

fun main() {
    val nums = intArrayOf(1, 2, 3, 1)
    val k = 3

    val result = containsNearbyDuplicate(nums, k)

    print(result)
}


/**
 * 1, 2, 3, 1
 *
 *
 * [
 *
 * ]
 */
private fun containsNearbyDuplicate(nums: IntArray, k: Int): Boolean {
    var l = 0
    var r = 0

    val seen = mutableSetOf<Int>()

    while (r < nums.size) {
        if (r - l > k) {
            seen.remove(nums[l])
            l++
        }

        if (seen.contains(nums[r])) {
            return true
        } else {
            seen.add(nums[l])
        }
        r++
    }
    return false
}