package com.ddanilov.newchallange

import java.util.Arrays
import kotlin.math.abs

fun main() {
    val nums = intArrayOf(1, 1, 1, 0)
    val target = 100

    val result = threeSumClosest(nums, target)

    println(result)
}

/**
 * -1, 2, 1, -4
 *
 * -4,-1, 1, 2
 *  i
 *     l
 *           r
 *
 *
 */
private fun threeSumClosest(nums: IntArray, target: Int): Int {
    Arrays.sort(nums)
    var result = nums[0] + nums[1] + nums[2]

    for (i in nums.indices) {
        var l = i + 1
        var r = nums.lastIndex

        while (l < r) {
            val currSum = nums[i] + nums[l] + nums[r]
            if (currSum > target) {
                r--
            } else {
                l++
            }
            if (abs(currSum - target) < abs(result - target)) {
                result = currSum
            }
        }
    }

    return result
}