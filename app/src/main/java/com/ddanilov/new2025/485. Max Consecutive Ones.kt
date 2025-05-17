package com.ddanilov.new2025


fun main() {
    val nums = intArrayOf(1, 1, 0, 1, 1, 1)

    val result = findMaxConsecutiveOnes(nums)

    println(result)

}


/**
 * 1,0,1,1,0,1
 *
 *
 */
private fun findMaxConsecutiveOnes(nums: IntArray): Int {
    var counter = 0
    var max = 0

    for (num in nums) {
        if (num == 1) {
            counter++
            max = maxOf(counter, max)
        } else {
            counter = 0
        }
    }

    return max
}