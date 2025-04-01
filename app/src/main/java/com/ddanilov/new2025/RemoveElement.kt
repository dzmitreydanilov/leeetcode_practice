package com.ddanilov.new2025

fun main() {

    val nums = intArrayOf(3, 2, 2, 3)
    val target = 3

    val result = removeElement(nums, target)

    println("XXX result: $result")
}

/**
 * value = 2
 *  [0,1,2,2,3,0,4,2]
 *
 *  [0,1,2,2,3,0,4,2]
 *   i
 *   k
 *  i = 1
 *  k = 2
 */

private fun removeElement(nums: IntArray, `val`: Int): Int {
    var k = 0
    for (i in nums.indices) {
        if (`val` != nums[i]) {
            nums[k] = nums[i]
            k++
        }
    }

    return k
}