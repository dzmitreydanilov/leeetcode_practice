package com.ddanilov.new2025

fun main() {
    val nums = intArrayOf(2, 7, 11, 15)
    val target = 9

    val result = twoSum(nums, target)

    result.forEach {
        println("XXX ${it}")

    }
}

fun twoSumBrut(nums: IntArray, target: Int): IntArray {
    for (i in nums.indices) {
        for (j in i + 1 until nums.size) {
            if (nums[j] + nums[i] == target) {
                return intArrayOf(i, j)
            }
        }
    }

    return intArrayOf()
}

/**
 *
 * 9 - 2 = 7
 * 9 - 7 = 2
 *
 * {
 * 2 : 0
 *
 * }
 */
fun twoSum(nums: IntArray, target: Int): IntArray {
    val map = mutableMapOf<Int, Int>()
    for (i in nums.indices) {
        val result = target - nums[i]
        if (map.containsKey(result)) {
            val index = map[result]!!
            return intArrayOf(index, i)
        }

        map[nums[i]] = i
    }

    return intArrayOf()
}
