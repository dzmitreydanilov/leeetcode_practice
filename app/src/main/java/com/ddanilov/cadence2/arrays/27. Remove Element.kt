package com.ddanilov.cadence2.arrays

fun main() {
    val nums = intArrayOf(3, 2, 2, 3)
    val element = 3

    val result = removeElement(nums, element)

    println(result)
}

/**
 * 2, 2, 3, 3
 *       k
 *           i
 */
private fun removeElement(nums: IntArray, `val`: Int): Int {

    var k = 0

    for (i in nums.indices) {
        if (nums[i] != `val`) {
            nums[k] = nums[i]
            k++
        }
    }

    return k
}