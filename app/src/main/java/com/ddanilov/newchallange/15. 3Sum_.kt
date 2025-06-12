package com.ddanilov.newchallange

import java.util.Arrays

fun main() {
    val nums = intArrayOf(-1, 0, 1, 2, -1, -4)

    val result = threeSum(nums)

    result.forEach { innerList ->
        println(innerList)
    }
}


/**
 * -1, 0, 1, 2, -1, -4
 *
 * -1, -1, -1, 0, 1, 2
 */
private fun threeSum(nums: IntArray): List<List<Int>> {
    Arrays.sort(nums)
    val result = mutableListOf<List<Int>>()

    for (i in nums.indices) {
        if (i == 0 || (i > 0 && nums[i] != nums[i - 1])) {
            var l = i + 1
            var r = nums.lastIndex

            while (l < r) {
                if (nums[i] + nums[l] + nums[r] == 0) {
                    result.add(listOf(nums[i], nums[l], nums[r]))
                    while (l < r && nums[l] == nums[l + 1]) l++
                    while (l < r && nums[r] == nums[r - 1]) r--
                    r--
                    l++
                } else if (nums[i] + nums[l] + nums[r] > 0) {
                    r--
                } else {
                    l++
                }
            }
        }
    }
    return result
}