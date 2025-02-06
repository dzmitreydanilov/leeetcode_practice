package com.ddanilov.algo_learning.arrays

fun main() {
    val array = intArrayOf(1, 2, 3, 15, 2, 123)
    val result = containsDuplicates2(array)

    println(result)
}

// Time complexity O(n^2)
// MEmory complexity O(1)
private fun containsDuplicates(nums: IntArray): Boolean {
    for (i in nums.indices) {
        for (j in i + 1 until nums.size) {
            if (nums[i] == nums[j]) {
                return true
            }
        }
    }
    return false
}

//O(n)
//O(n)
private fun containsDuplicates1(nums: IntArray): Boolean {
    val set = HashSet<Int>()
    nums.forEach {
        if (set.add(it)) return true
    }

    return false
}

// TC O(nlogn)
// SC O(1)
private fun containsDuplicates2(nums: IntArray): Boolean {
    nums.sort()

    for (i in 0 until nums.size - 1) {
        if (nums[i] == nums[i + 1]) {
            return true
        }
    }

    return false
}
