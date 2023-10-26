package com.ddanilov.topQestions

import java.util.Arrays

fun main() {
    var nums = intArrayOf(1, 4, 3, 2)

    println(arrayPairSum(nums))
}

private fun arrayPairSum(nums: IntArray): Int {
    var sum = 0
    Arrays.sort(nums)
    for (i in nums.indices step 2) {
        sum += nums[i]
    }
    return sum
}
