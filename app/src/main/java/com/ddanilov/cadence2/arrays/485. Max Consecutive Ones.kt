package com.ddanilov.cadence2.arrays

import kotlin.math.max

fun main() {
    val nums = intArrayOf(1, 1, 0, 1, 1, 1)

    val result = findMaxConsecutiveOnes(nums)

    println(result)
}

private fun findMaxConsecutiveOnes(nums: IntArray): Int {
    var counter = 0
    var answer = 0

    for (num in nums) {
        if (num == 1) {
            counter++
            answer = maxOf(answer, counter)
        } else {
            counter = 0
        }
    }

    return answer
}

