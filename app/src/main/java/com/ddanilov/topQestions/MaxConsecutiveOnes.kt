package com.ddanilov.topQestions

fun main() {
    val nums = intArrayOf(1, 1, 0, 1, 1, 1)

    println(findMaxConsecutiveOnes(nums))
}

private fun findMaxConsecutiveOnes(nums: IntArray): Int {
    var counter = 0

    for (i in nums.indices) {
        if (nums[i] == 1) {
            counter++
        } else {
            counter = 0
        }
    }

    return counter
}
