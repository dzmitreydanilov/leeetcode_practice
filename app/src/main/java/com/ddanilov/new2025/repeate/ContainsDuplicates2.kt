package com.ddanilov.new2025.repeate

fun main() {

    val nums = intArrayOf(1, 2, 3, 1)
    val k = 3

    val result = containsNearbyDuplicate(nums, k)

    println("XXX $result")
}


/**
 * k <= 3
 * 1, 2, 11, 11, 12, 1
 * l
 *           r
 *
 * l = 0
 * r = 3
 * [1,2,11,]
 */
private fun containsNearbyDuplicate(nums: IntArray, k: Int): Boolean {
    val seen = mutableSetOf<Int>()

    var l = 0

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