package com.ddanilov.new2025.repeate

fun main() {
    val nums = intArrayOf(1,2)

    val result = removeDuplicates(nums)

    println("XXX $result")
}

/**
 * 1,2
 *   l
 *   r
 */
private fun removeDuplicates(nums: IntArray): Int {
    var l = 1
    for (r in 1 until nums.size) {
        if (nums[r] != nums[r - 1]) {
            nums[l] = nums[r]
            l++
        }
    }
    return l
}
