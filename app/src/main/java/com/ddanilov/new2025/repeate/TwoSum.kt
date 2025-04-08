package com.ddanilov.new2025.repeate

fun main() {
    val nums = intArrayOf(2, 7, 11, 15)
    val target = 9

    val result = twoSum(nums, target)

    result.forEach {
        print("$it, ")
    }
}

/**
 * 2, 7, 11, 15
 */

private fun twoSum(nums: IntArray, target: Int): IntArray {
    val map = mutableMapOf<Int, Int>()

    for (i in nums.indices) {
        val result = target - nums[i]
        if (map.containsKey(result)) {
            return intArrayOf(i, map[result]!!)
        }

        map[nums[i]] = i
    }

    return intArrayOf()
}