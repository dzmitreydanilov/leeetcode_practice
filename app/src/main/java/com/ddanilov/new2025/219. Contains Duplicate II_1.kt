package com.ddanilov.new2025

fun main() {
    val nums = intArrayOf(1, 2, 3, 1, 2, 3)
    val k = 2

    val result = containsNearbyDuplicate(nums, k)

    println(result)
}

/**
 * 1,2,3,1
 * i
 *     j
 * [1,2,3]
 */
private fun containsNearbyDuplicate(nums: IntArray, k: Int): Boolean {
    val set = mutableSetOf<Int>()
    var i = 0
    for (j in nums.indices) {
        if (j - i >= k) {
            set.remove(nums[i])
            i++
        }

        if (set.contains(nums[j])) {
            return true
        } else {
            set.add(nums[j])
        }
    }

    return false
}
