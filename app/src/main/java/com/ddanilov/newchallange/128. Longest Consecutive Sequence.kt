package com.ddanilov.newchallange

import kotlin.math.max

fun main() {
    val nums = intArrayOf(100, 4, 200, 1, 3, 2)

    val result = longestConsecutive(nums)

    println(result)
}

/**
 *
 */
private fun longestConsecutive(nums: IntArray): Int {
    val set = nums.toHashSet()
    var longest = 0
    nums.forEach {
        if (!set.contains(it - 1)) {
            var length = 0
            while (it + length in set) {
                length++
            }
            longest = maxOf(length, longest)
        }
    }

    return longest
}