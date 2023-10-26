package com.ddanilov.topQestions

fun main() {
    val nums = intArrayOf(2, 5, 5, 11)
    val target = 10
    val result = twoSum1(nums, target)

    println(result.joinToString(" "))
}

// TC O(n^2)
private fun twoSum(nums: IntArray, target: Int): IntArray {
    for (i in nums.indices) {
        for (j in i + 1 until nums.size) {
            if (nums[i] + nums[j] == target) {
                return intArrayOf(i, j)
            }
        }
    }
    return intArrayOf()
}

// TC O(n)
// SC O(n)
private fun twoSum1(nums: IntArray, target: Int): IntArray {
    val map = HashMap<Int, Int>()
    for (i in nums.indices) {
        val diff = target - nums[i]
        if (map.contains(diff)) {
            return intArrayOf(i, map[diff]!!)
        }

        map[nums[i]] = i
    }

    return intArrayOf()
}
