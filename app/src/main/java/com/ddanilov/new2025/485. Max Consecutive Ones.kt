package com.ddanilov.new2025

fun main() {

    val nums = intArrayOf(1, 1, 0, 1, 1, 1)

    val result = findMaxConsecutiveOnes(nums)

    println("XXX $result")

}

/**
 * 1, 1, 0, 1, 1, 1
 *                r
 *
 * c = 3
 * m = 2
 */
private fun findMaxConsecutiveOnes(nums: IntArray): Int {
    var counter = 0
    var max = 0

    for (num in nums) {
        if (num == 1) {
            counter++
        } else {
            max = maxOf(counter, max)
            counter = 0
        }
    }

    return maxOf(counter, max)
}
