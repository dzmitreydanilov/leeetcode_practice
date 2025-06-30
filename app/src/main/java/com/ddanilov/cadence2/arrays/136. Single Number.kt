package com.ddanilov.cadence2.arrays


fun main() {
    val nums = intArrayOf(2, 3, 3, 2, 1)

    val result = singleNumber(nums)

    println(result)
}

private fun singleNumber(nums: IntArray): Int {
    var answer = 0

    nums.forEach {
        answer = answer xor it
    }

    return answer
}
