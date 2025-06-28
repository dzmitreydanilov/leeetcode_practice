package com.ddanilov.newchallange

fun main() {
    val nums = intArrayOf(1, 12, -5, -6, 50, 3)
    val k = 4
    val result = findMaxAverage(nums, k)

    println(result)

}

/**
 * 0   1   2   3   4  5
 * 1, 12, -5, -6, 50, 3
 *
 *
 *
 */
private fun findMaxAverage(nums: IntArray, k: Int): Double {
    var sum = 0
    var answer = 0

    for (i in 0..k - 1) {
        sum += nums[i]
    }

    answer = sum
    for (i in k..nums.lastIndex) {
        sum += nums[i] - nums[i - k]

        answer = maxOf(sum, answer)
    }

    return answer / k.toDouble()
}