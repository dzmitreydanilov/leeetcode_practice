package com.ddanilov.cadence2.arrays

import java.util.Arrays

fun main() {
    val nums = intArrayOf(-1, 0, 1, 1, 2, -1, -4)

    val res = threeSum(nums)

    res.forEach {
        println(it)
    }
}

/**
 * -1, 0, 1, 1, 2, -1, -4
 *
 *  -2, 0, 0, 2, 2
 *   i
 *           j
 *         k
 *
 *  [
 *  [-2, 0, 2]
 *
 *  ]
 */
private fun threeSum(nums: IntArray): List<List<Int>> {
    Arrays.sort(nums)
    val answer = mutableListOf<List<Int>>()

    for (i in nums.indices) {
        if (i == 0 || nums[i] != nums[i - 1]) {
            var j = i + 1
            var k = nums.lastIndex
            while (j < k) {
                if (nums[i] + nums[j] + nums[k] == 0) {
                    answer.add(listOf(nums[i] + nums[j] + nums[k]))
                    while (j < k && nums[j] == nums[j + 1]) j++
                    while (j < k && nums[k] == nums[k + 1]) k--
                    j++
                    k--
                } else if (nums[i] + nums[j] + nums[k] > 0) {
                    k--
                } else {
                    j++
                }
            }
        }
    }


    return answer
}
