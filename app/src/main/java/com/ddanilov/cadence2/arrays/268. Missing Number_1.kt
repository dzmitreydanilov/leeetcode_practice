package com.ddanilov.cadence2.arrays

fun main() {
    val nums = intArrayOf(3, 0, 1)

    val result = missingNumber(nums)

    print(result)
}


private fun missingNumber(nums: IntArray): Int {
    var answer = nums.size

    for(i in nums.indices) {
        answer += i - nums[i]
    }

    return answer
}