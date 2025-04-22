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
 * -4, -3, -2, -7, 8, 2, -3, -1
 *
 */
private fun findDisappearedNumbers(nums: IntArray): List<Int> {
    val result = mutableListOf<Int>()
    for (i in nums.indices) {
        val index = abs(nums[i]) - 1
        val value = abs(nums[index])
        nums[index] = -value
    }


    for (i in nums.indices) {
        if (nums[i] > 0) {
            result.add(i + 1)
        }
    }

    return result
}