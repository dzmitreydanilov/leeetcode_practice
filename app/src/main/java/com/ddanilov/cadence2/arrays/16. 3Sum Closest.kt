package com.ddanilov.cadence2.arrays

import java.util.Arrays
import kotlin.math.abs

fun main() {
    val nums = intArrayOf(-1, 2, 1, -4)
    val target = 1

    val result = threeSumClosest(nums, target)

    println(result)
}

/**
 * -1, 2, 1, -4
 *  i
 *
 *  -4,-1, 1, 2
 *   i
 *      l
 *            r
 */
private fun threeSumClosest(nums: IntArray, target: Int): Int {
    Arrays.sort(nums)
    var answer = nums[0] + nums[1] + nums[2]
    for (i in nums.indices) {
        var l = i + 1
        var r = nums.lastIndex
        while (l < r) {
            val current = nums[i] + nums[l] + nums[r]
            if (current > target) {
                r--
            } else {
                l++
            }

            if (abs(current - target) < abs(target - answer)) {
                answer = current
            }
        }
    }

    return answer
}
