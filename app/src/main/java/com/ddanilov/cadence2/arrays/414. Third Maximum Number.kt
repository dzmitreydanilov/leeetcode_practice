package com.ddanilov.cadence2.arrays

fun main() {
    val nums = intArrayOf(3, 2, 1)

    val result = thirdMax(nums)

    println(result)
}

/**
 * X, 2, 2, 1
 *
 * m = 3
 * s = 2
 *
 */
private fun thirdMax(nums: IntArray): Int {
    var max: Int? = null
    var second: Int? = null
    var third: Int? = null

    for (num in nums) {
        if (max == num || second == num || third == num) continue
        if (max == null || max < num) {
            third = second
            second = max
            max = num
        } else if (second == null || second < num) {
            third = second
            second = num
        } else if (third == null || third < num) {
            third = num
        }
    }

    return third ?: max!!
}