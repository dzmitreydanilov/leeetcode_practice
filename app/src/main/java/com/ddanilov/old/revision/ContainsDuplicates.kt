package com.ddanilov.revision

fun main() {
    val nums = intArrayOf(1, 2, 3, 1)
    val result = containsDuplicate(nums)

    println(result)
}

// TC O(nlogn)
private fun containsDuplicate(nums: IntArray): Boolean {
    nums.sort()

    for (i in 0 until nums.size - 1) {
        if (nums[i] == nums[i + 1]) {
            return true
        }
    }

    return false
}
