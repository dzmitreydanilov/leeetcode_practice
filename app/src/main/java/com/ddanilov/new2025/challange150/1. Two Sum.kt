package com.ddanilov.new2025.challange150

fun main() {
    val nums = intArrayOf(3, 2, 4)
    val k = 6

    val result = twoSum(nums, k)

    result.forEach {
        println(it)
    }
}

/**
 *
 * 3,2,4
 * k = 6
 *
 * 6 - 4 = 2
 *
 * {
 * 3:0
 * 2:0
 *
 *
 *
 *
 */
private fun twoSum(nums: IntArray, target: Int): IntArray {
    val seemMap = mutableMapOf<Int, Int>()
    for (i in nums.indices) {
        val diff = target - nums[i]
        if (seemMap.contains(diff)) {
            return intArrayOf(i, seemMap[diff]!!)
        } else {
            seemMap[nums[i]] = i
        }
    }
    return intArrayOf()
}