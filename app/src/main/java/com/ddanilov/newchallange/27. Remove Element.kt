package com.ddanilov.newchallange

fun main() {
    val nums = intArrayOf(0,1,2,2,3,0,4,2)
    val `val` = 2

    val result = removeElement(nums, `val`)

    println(result)
}


/**
 * 0,1,3,0,4,0,4,2
 *                i
 *           j
 *
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