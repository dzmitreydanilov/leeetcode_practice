package com.ddanilov.newchallange

fun main() {
    val nums = intArrayOf(0, 1, 0, 3, 12)
    moveZeroes(nums)

}

/**
 * 0, 1, 0, 3, 12
 *    l
 *          r
 */
private fun moveZeroes(nums: IntArray): Unit {
    var l = 0

    for (i in nums.indices) {
        if (nums[i] != 0) {
            val tmp = nums[i]
            nums[i] = nums[l]
            nums[l] = tmp
            l++
        }
    }
    nums.forEach {
        println(it)
    }
}
