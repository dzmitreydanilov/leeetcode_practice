package com.ddanilov.cadence2.arrays

fun main() {
    val nums = intArrayOf(100, 4, 200, 1, 3, 2)

    val result = longestConsecutive(nums)

    println(result)
}

/**
 * 100, 4, 200, 1, 3, 2
 *
 * [100,4,200,1,3,2]
 * 99
 *
 */
private fun longestConsecutive(nums: IntArray): Int {
    val set = nums.toSet()

    var answer = 0

    for (num in nums) {
        val isSequenceStart = !set.contains(num - 1)
        if (isSequenceStart) {
            var length = 1
            var nextItem = num + 1
            while (set.contains(nextItem)) {
                nextItem++
                length++
            }

            answer = maxOf(answer, length)
        }
    }

    return answer
}