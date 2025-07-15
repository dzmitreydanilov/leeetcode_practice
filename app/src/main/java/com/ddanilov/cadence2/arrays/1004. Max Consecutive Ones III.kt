package com.ddanilov.cadence2.arrays

import kotlin.properties.Delegates.vetoable

fun main() {
    val nums = arrayOf(
        'H',
        'H',
        'W',
        'W',
        'H',
        'H',
        'W',
        'W',
        'W',
        'H',
        'W',
        'W',
        'H',
        'H',
        'H',
        'W',
        'W',
        'W',
        'W'
    )
    val k = 3

    val result = longestOnes(nums, k)


    println(result)
}

/**
 * 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 0, 0, 0, 1, 1, 1, 1
 *    i
 *                   j
 *
 * 0 1  1  1   1  1
 *
 * fl = 2 out 3
 *
 */
private fun longestOnes(nums: Array<Char>, k: Int): Int {
    var zeroFlipped = 0
    var answer = 0
    var start = 0

    for (end in nums.indices) {
        if (nums[end] == 'W') {
            zeroFlipped++
        }

        while (zeroFlipped > k) {
            if (nums[start] == 'W') {
                zeroFlipped--
            }
            start++
        }

        answer = maxOf(answer, end - start + 1)
    }


    return answer
}