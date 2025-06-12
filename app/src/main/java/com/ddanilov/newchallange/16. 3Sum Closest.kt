package com.ddanilov.newchallange

import java.util.Arrays
import kotlin.math.abs

fun main() {
    val nums = intArrayOf(1, 1, 1, 0)
    val target = -100

    val result = threeSumClosest(nums, target)

    println(result)
}

/**
 * 0
 * 1
 * 1 1
 * l
 * r
 * curr = 2
 *
 * r = 2
 * target = -100
 */
private fun threeSumClosest(nums: IntArray, target: Int): Int {
    Arrays.sort(nums)
    var result = nums[0] + nums[1] + nums[2]

    for (i in 0 until nums.size ) {
        var l = i + 1
        var r = nums.lastIndex

        while (l < r) {
            val currentSum = nums[i] + nums[l] + nums[r]
            if (currentSum > target) {
                r--
            } else {
                l++
            }
            if (abs(currentSum - target) < abs(result - target)) {
                result = currentSum
            }
        }
    }

    return result
}