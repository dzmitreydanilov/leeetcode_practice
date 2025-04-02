package com.ddanilov.new2025

fun main() {

    val nums = intArrayOf(3, 2, 2, 3)
    val value = 3

    val result = removeElement(nums, value)

    println("XXXX $result")
}

/**
 * 2,3,2,3
 * l
 * r
 * nums[r] != targetTo
 *
 * targetTo = 3
 *
 *
 *
 */

private fun removeElement(nums: IntArray, `val`: Int): Int {
    var l = 0
    for(i in nums.indices) {
        if(nums[i] != `val`) {
            nums[l] = nums[i]
            l++
        }
    }

    return l
}