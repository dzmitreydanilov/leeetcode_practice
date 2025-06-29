package com.ddanilov.cadence2.arrays

fun main() {
    val nums = intArrayOf(0, 0, 1, 1, 1, 2, 2, 3, 3, 4)

    val result = removeDuplicates(nums)

    println(result)
}

/**
 * 0, 1, 2, 1, 1, 2, 2, 3, 3, 4
 *    k
 *    r
 *
 */
private fun removeDuplicates(nums: IntArray): Int {
    var k = 1

    for (i in 1 until nums.size) {
        if (nums[i] != nums[i - 1]) {
            nums[k] = nums[i]
            k++
        }
    }

    return k
}