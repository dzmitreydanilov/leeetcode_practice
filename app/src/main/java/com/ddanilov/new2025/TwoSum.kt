package com.ddanilov.new2025

fun main() {
    val array = intArrayOf(2, 11, 15, 7)
    val targetSum = 9
    val result = twoSumBrutOptimized(array, targetSum)
    result.forEach {
        println("Indexes: $it")
    }
}

private fun twoSumBrutForce(nums: IntArray, target: Int): IntArray {
    for (i in nums.indices) {
        for (j in i + 1 until nums.size) {
            if (nums[i] + nums[j] == target) {
                return intArrayOf(i, j)
            }
        }
    }
    return intArrayOf()
}


/**
 * 9 - 2 = 7
 * 9 - 11 = -2
 * 9 - 15 = -6
 * 9 - 7 = 2
 *
 * 9 - 2 = 7
 * 9 - 7 = 2
 *
 *
 * {
 * 2 : 0
 * 11 : 1
 * 16 : 2
 * 7 : 3
 * }
 *
 */

private fun twoSumBrutOptimized(nums: IntArray, target: Int): IntArray {
    val map = mutableMapOf<Int, Int>()
    for (i in nums.indices) {
        val result = target - nums[i]
        if (map.containsKey(result)) {
            return intArrayOf(map[result]!!, i)
        }

        map[nums[i]] = i
    }

    return intArrayOf()
}

