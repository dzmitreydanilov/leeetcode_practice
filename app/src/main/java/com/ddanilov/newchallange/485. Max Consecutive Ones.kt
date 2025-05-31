package com.ddanilov.newchallange

fun main() {
    val nums = intArrayOf(1, 1, 0, 1, 1, 1)

    val result = findMaxConsecutiveOnes(nums)

    print(result)
}


/**
 * 1, 1, 0, 1, 1, 1
 *
 */
private fun findMaxConsecutiveOnes(nums: IntArray): Int {
    var count = 0
    var max = 0

    for (num in nums) {
        if (num == 1) {
            count++
            max = maxOf(count, max)
        } else {
            count = 0
        }
    }

    return max
}