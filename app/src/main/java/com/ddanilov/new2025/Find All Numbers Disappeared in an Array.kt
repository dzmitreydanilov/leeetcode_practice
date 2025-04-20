package com.ddanilov.new2025

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
 * i = 3
 *
 */

private fun findDisappearedNumbers(nums: IntArray): List<Int> {

    val result = mutableListOf<Int>()
    for (i in nums.indices) {
        val index = abs(nums[i]) - 1
        nums[index] = -abs(nums[index])
    }

    nums.forEachIndexed { index, i ->
        if (nums[index] > 0) {
            result.add(index + 1)
        }
    }

    return result
}