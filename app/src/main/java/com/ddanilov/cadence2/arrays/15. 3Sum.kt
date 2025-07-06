package com.ddanilov.cadence2.arrays

import java.util.Arrays

fun main() {
    val nums = intArrayOf(-4, -1, -1, -1, 0, 1, 2)
    val result = threeSum(nums)


}

/**
 * -4, 1, 1, 3, 3
 *  i
 *           l
 *           r
 *
 *  [-1,-1,2]
 *  []
 */
private fun threeSum(nums: IntArray): List<List<Int>> {
        Arrays.sort(nums)
        val answer = mutableListOf<List<Int>>()

        for (i in nums.indices) {
            if (i == 0 || (i > 0 && nums[i] != nums[i - 1])) {
                var l = i + 1
                var r = nums.lastIndex

                while (l < r) {
                    if (nums[i] + nums[l] + nums[r] == 0) {
                        answer.add(listOf(nums[i], nums[l], nums[r]))
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

        return answer
}