package com.ddanilov.cadence2.arrays

fun main() {
    val nums = intArrayOf(2, 7, 11, 15)
    val target = 9

    val result = twoSum(nums, target)

    result.forEach {
        println(it)
    }
}

/**
 * 2, 7, 11, 15
 *
 * target = 9
 *
 * {
 *  2 : i
 *  3: i
 * }
 */
private fun twoSum(nums: IntArray, target: Int): IntArray {
    val map = mutableMapOf<Int, Int>()

    for (i in nums.indices) {
        val diff = target - nums[i]

        if (map.contains(diff)) {
            return intArrayOf(i, map[diff]!!)
        }

        map[nums[i]] = i
    }

    return intArrayOf()
}