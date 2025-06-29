package com.ddanilov.cadence2.arrays

fun main() {

    val nums = intArrayOf(2, 7, 11, 15)
    val target = 9

    val result = twoSum(nums, target)

    result.forEach {
        println(it)
    }
}

private fun twoSum(nums: IntArray, target: Int): IntArray {
    val seen = mutableMapOf<Int, Int>()

    for (i in nums.indices) {
        val diff = target - nums[i]

        if (seen.contains(diff)) {
            return intArrayOf(i, seen[diff]!!)
        }

        seen[nums[i]] = i
    }

    return intArrayOf()
}
