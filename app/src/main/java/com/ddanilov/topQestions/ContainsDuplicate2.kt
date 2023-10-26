package com.ddanilov.topQestions

import kotlin.math.abs

fun main() {
    val nums = intArrayOf(1, 0, 1, 1)
    val k = 1

    println(containsNearbyDuplicate(nums, k))

}

// SC O(n)
// TC O(n)
private fun containsNearbyDuplicate(nums: IntArray, k: Int): Boolean {
    val map = HashMap<Int, Int>()
    for (i in nums.indices) {
        if (!map.contains(nums[i])) {
            map[nums[i]] = i
        } else {
            val storedIndex = map[nums[i]]!!
            if (abs(i - storedIndex) <= k) return true else map[nums[i]] = i
        }
    }
    return false
}
