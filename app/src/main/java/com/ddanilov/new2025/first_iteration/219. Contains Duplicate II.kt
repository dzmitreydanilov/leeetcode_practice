package com.ddanilov.new2025.first_iteration

fun main() {
    val nums = intArrayOf(1,2,3,1,2,3)
    val k = 2

    val result = containsNearbyDuplicate(nums, k)

    println(result)
}

/**
 * 1,2,3,1,2,3
 *       i
 *           j
 *
 * [1,2,3]
 *
 * k=2
 */

private fun containsNearbyDuplicate(nums: IntArray, k: Int): Boolean {

        var i = 0
        val set = mutableSetOf<Int>()

        for (j in nums.indices) {
            if (j - i > k) {
                set.remove(nums[i])
                i++
            }

            if (set.contains(nums[j])) {
                return true
            } else {
                set.add(nums[i])
            }
        }

        return false
}