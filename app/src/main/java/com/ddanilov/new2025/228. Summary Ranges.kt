package com.ddanilov.new2025

fun main() {
    val nums = intArrayOf(0, 1, 2, 4, 5, 7)

    val result = summaryRanges(nums)

    result.forEach {
        print("$it, ")
    }
}

/**
 * 0, 1, 2, 4, 5, 7
 *           l
 *              r
 */
private fun summaryRanges(nums: IntArray): List<String> {
    var start = 0
    var r = 1

    val result = mutableListOf<String>()

    while (r <= nums.size) {
        if (r < nums.size && nums[r] == nums[r - 1] + 1) {
            r++
        } else {
            result.add(generateRange(nums[start], nums[r - 1]))
            start = r
            r++
        }

    }

    return result
}

private fun generateRange(start: Int, end: Int): String {
    return if (start == end) {
        "$start"
    } else {
        "$start->$end"
    }
}