package com.ddanilov.new2025.repeate

fun main() {
    val nums = intArrayOf(0,1)

    val result = missingNumberBrut(nums)

    println("XXX $result")
}

/**
 * 3, 0, 1
 *
 * 1, 0, 3
 */
private fun missingNumber(nums: IntArray): Int {
    var result = (nums.size * (nums.size + 1)) / 2

    nums.forEach {
        result -= it
    }

    return result
}

/**
 * 0, 1
 */
private fun missingNumberBrut(nums: IntArray): Int {
    nums.sort()
    var pointer = 0

    while (pointer <= nums.size) {
        if (pointer == nums.size || pointer != nums[pointer]) return pointer
        pointer++
    }
    return 0
}
