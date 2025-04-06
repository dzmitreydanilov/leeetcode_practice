package com.ddanilov.new2025

fun main() {
    val nums = intArrayOf(0, 1, 2, 4, 5, 7)

    val result = summaryRanges(nums)

    result.forEach {
        print("$it, ")
    }
}

/**
 * 0,1,2,4,5,7
 * l
 *   r
 *
 *
 */

private fun summaryRanges(nums: IntArray): List<String> {
    var l = 0
    var r = 1

    val result = mutableListOf<String>()

    while (r <= nums.size) {
        val rangeStart = nums[l]
        if (r < nums.size && nums[r] == nums[r - 1] + 1) {
            r++
        } else {
            result.add(convertToRange(rangeStart, nums[r - 1]))
            l = r
            r++
        }
    }

    return result
}

private fun convertToRange(num1: Int, num2: Int): String {
    return if (num1 == num2) {
        "$num1"
    } else {
        "$num1->$num2"
    }
}