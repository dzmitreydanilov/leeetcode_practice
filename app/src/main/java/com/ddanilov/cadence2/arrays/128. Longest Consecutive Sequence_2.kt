package com.ddanilov.cadence2.arrays

fun main() {
    val nums = intArrayOf(100, 4, 200, 1, 3, 2)

    val result = longestConsecutive(nums)

    println(result)
}


/**
 * 100, 4, 200, 1, 3, 2
 *
 *
 */
private fun longestConsecutive(nums: IntArray): Int {
    val set = nums.toSet()

    var answer = 0

    for (num in nums) {
        val isStart = !set.contains(num - 1)

        if (isStart) {
            var length = 1
            var next = num + 1

            while (set.contains(next)) {
                length++
                next++
            }

            answer = maxOf(length, answer)
        }
    }

    return answer
}