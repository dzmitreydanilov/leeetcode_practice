package com.ddanilov.newchallange

fun main() {
    val nums = intArrayOf(0, 1, 0, 3, 12)

    moveZeroes(nums)

}

/**
 * 1, 3, 0, 0, 12
 *       i
 *              j
 */
private fun moveZeroes(nums: IntArray): Unit {
    var j = 0
    for (i in nums.indices) {
        if (nums[i] != 0) {
            val temp = nums[j]
            nums[j] = nums[i]
            nums[i] = temp
            j++
        }
    }

    nums.forEach {
        println(it)
    }
}