package com.ddanilov.cadence2.arrays

fun main() {
    val nums = intArrayOf(1, 12, -5, -6, 50, 3)
    val k = 4

    val result = findMaxAverage(nums, k)

    println(result)
}

private fun findMaxAverage(nums: IntArray, k: Int): Double {
    var answer = nums.slice(0..k - 1).sum()

    //curr = 2+50 -1
    for (i in k..nums.lastIndex) {
        val curr = answer + nums[i] - nums[i - k]
        answer = maxOf(curr, answer)
    }

    return answer / k.toDouble()
}