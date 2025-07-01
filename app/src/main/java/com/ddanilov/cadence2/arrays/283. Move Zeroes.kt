package com.ddanilov.cadence2.arrays

fun main() {
    val nums = intArrayOf(0, 1, 0, 3, 12)

    moveZeroes(nums)
}

/**
 * 1,
 *    i
 * j
 */
private fun moveZeroes(nums: IntArray): Unit {
    var j = 0

    for (i in nums.indices) {
        if (nums[i] != 0) {
            val tmp = nums[j]
            nums[j] = nums[i]
            nums[i] = tmp
            j++
        }
    }

    nums.forEach {
        println(it)
    }
}