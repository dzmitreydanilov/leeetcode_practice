package com.ddanilov.cadence2.arrays

import kotlin.math.abs

fun main() {
    val nums = intArrayOf(4, 3, 2, 7, 8, 2, 3, 1)

    val result = findDisappearedNumbers(nums)

    result.forEach {
        println(it)
    }
}

/**
 * 4, 3, 2, 7, 8, 2, 3, 1
 *
 *
 */
private fun findDisappearedNumbers(nums: IntArray): List<Int> {

    for (i in nums.indices) {
        val index = abs(nums[i]) - 1
        val value = nums[index]
        nums[index] = -abs(value)
    }

    val answer = mutableListOf<Int>()
    nums.forEachIndexed { i, v ->
        if (v > 0) {
            answer.add(i + 1)
        }
    }

    return answer
}
