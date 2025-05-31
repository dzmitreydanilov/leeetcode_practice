package com.ddanilov.newchallange

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
 * -4, -3, -2, -7, 8, 2, -3, -1
 *
 */
private fun findDisappearedNumbers(nums: IntArray): List<Int> {

    for (i in nums.indices) {
        val index = abs(nums[i]) - 1
        val value = abs(nums[index])
        nums[index] = -value
    }

    val result = mutableListOf<Int>()

    nums.forEachIndexed { index, v ->
        if (v > 0) {
            result.add(index + 1)
        }
    }

    return result
}