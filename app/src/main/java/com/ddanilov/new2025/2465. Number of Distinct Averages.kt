package com.ddanilov.new2025

import java.util.Arrays

fun main() {
    val nums = intArrayOf(9, 5, 7, 8, 7, 9, 8, 2, 0, 7)

    val result = distinctAverages(nums)

    println(result)
}

/**
 * 4, 1, 4, 0, 3, 5
 */
private fun distinctAverages(nums: IntArray): Int {
    val set = mutableSetOf<Double>()

    var (l, r) = 0 to nums.lastIndex

    Arrays.sort(nums)

    while (l < r) {
        val average = (nums[l].toDouble() + nums[r].toDouble()) / 2
        set.add(average)

        l++
        r--
    }

    return set.size
}