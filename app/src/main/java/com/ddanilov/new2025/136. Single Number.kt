package com.ddanilov.new2025

fun main() {
    val nums = intArrayOf(2, 2, 1)
    val result = singleNumber(nums)
}


/**
 * 2, 2, 1
 */
private fun singleNumber(nums: IntArray): Int {
    var result = 0

    nums.forEach {
        result = it xor result
    }
    return result
}

/**
 *    8 4 2 1
 *    v v v v
 * 5  0 1 0 1
 * 3  0 0 1 1
 * 6  0 1 1 0
 *
 */
