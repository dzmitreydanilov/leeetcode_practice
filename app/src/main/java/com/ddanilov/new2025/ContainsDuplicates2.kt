package com.ddanilov.new2025

fun main() {
    val nums = intArrayOf(1, 2, 3, 1)
    val k = 3

    val result = containsNearbyDuplicate(nums, k)

    println("XXXX $result¬")
}

/**
 * 1,2,3,4,1
 *   l
 *          r
 *
 * [2, 3, 4, 1]
 */
private fun containsNearbyDuplicate(nums: IntArray, k: Int): Boolean {
    val duplicateSet = mutableSetOf<Int>()
    var l = 0
    for (r in nums.indices) {
        if (r - l > k) {
            duplicateSet.remove(nums[l])
            l++
        }
        if (duplicateSet.contains(nums[r])) {
            return true
        } else {
            duplicateSet.add(nums[r])
        }
    }
    return false
}