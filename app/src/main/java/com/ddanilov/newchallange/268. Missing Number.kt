package com.ddanilov.newchallange

fun main() {
    val nums = intArrayOf(3, 0, 1)

    val result = missingNumber(nums)

    println(result)
}

private fun missingNumber(nums: IntArray): Int {
    var result = nums.size

    for (i in nums.indices) {

        result += (i - nums[i])
        println(result)
    }

    return result
}