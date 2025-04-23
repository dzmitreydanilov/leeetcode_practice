package com.ddanilov.new2025.first_iteration

fun main() {
    val nums = intArrayOf(1, 1, 0, 1, 1, 1)

    val result = findMaxConsecutiveOnes(nums)

    println(result)
}

/**
 * 1, 1, 0, 1, 1, 1
 *                c
 *
 */
private fun findMaxConsecutiveOnes(nums: IntArray): Int {
    var counter = 0
    var max = 0

    for (num in nums) {
        if (num == 1) {
            counter++
        } else {
            counter = 0
        }

        max = maxOf(max, counter)
    }

    return max
}
