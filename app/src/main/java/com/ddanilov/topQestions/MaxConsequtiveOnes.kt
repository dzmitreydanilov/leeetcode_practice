package com.ddanilov.topQestions

fun main() {
    val nums = intArrayOf(1, 1, 0, 1, 1, 1)
    println(findMaxConsecutiveOnes(nums))
}

private fun findMaxConsecutiveOnes(nums: IntArray): Int {
    var max = 0
    var currentMax = 0

    for (num in nums) {
        if (num == 1) {
            currentMax += 1
            max = maxOf(currentMax, max)
        } else {
            currentMax = 0
        }
    }

    return max
}
