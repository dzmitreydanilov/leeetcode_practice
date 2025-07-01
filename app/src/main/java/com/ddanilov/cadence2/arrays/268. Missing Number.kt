package com.ddanilov.cadence2.arrays

fun main() {
    val nums = intArrayOf(3, 0, 1)

    val result = missingNumber(nums)

    println(result)
}

/**
 * answer = 3
 *
 * 0 - 3 = -3
 * answer = 0
 * 1 - 0 = 1
 * answer = 1
 * 2 - 1 = 1
 * answer = 2
 *
 *
 *
 */
private fun missingNumber(nums: IntArray): Int {
    var answer = nums.size

    for (i in nums.indices) {
        answer +=  i - nums[i]
    }

    return answer

}