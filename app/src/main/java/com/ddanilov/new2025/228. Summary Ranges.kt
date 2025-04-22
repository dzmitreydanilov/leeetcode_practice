package com.ddanilov.new2025

fun main() {

    val nums = intArrayOf(0, 1, 2, 4, 5, 7)
    val result = summaryRanges(nums)

    result.forEach {
        print("$it,")
    }
}

/**
 * 0, 1, 2, 4, 5, 7
 * l
 *          r
 *
 */
private fun summaryRanges(nums: IntArray): List<String> {
    val ranges = mutableListOf<String>()
    var rangeStart = 0
    var r = 1

    while (r <= nums.size) {
        if (r < nums.size && nums[r] == nums[r - 1] + 1) {
            r++
        } else {
            ranges.add(mapToRange(nums[rangeStart], nums[r - 1]))
            rangeStart = r
            r++
        }
    }
    return ranges
}

private fun mapToRange(num1: Int, num2: Int): String {
    return if (num1 == num2) {
        "$num1"
    } else {
        "$num1->$num2"
    }
}
