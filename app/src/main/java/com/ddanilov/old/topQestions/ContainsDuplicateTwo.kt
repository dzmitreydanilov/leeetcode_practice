package com.ddanilov.topQestions

import kotlin.math.abs

fun main() {
    val nums = intArrayOf(1, 2, 3, 1)
    val k = 3

    println(containsNearbyDuplicate(nums, k))
}

private fun containsNearbyDuplicate(nums: IntArray, k: Int): Boolean {
    val map = HashMap<Int, Int>()

    for (i in nums.indices) {
        if (!map.contains(nums[i])) {
            map[nums[i]] = i
        } else {
            val index = map[nums[i]]!!

            if (abs(index - i) <= k) return true else map[nums[i]] = i
        }

    }

    return false
}
