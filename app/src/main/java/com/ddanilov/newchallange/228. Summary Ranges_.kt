package com.ddanilov.newchallange

fun main() {
    val nums = intArrayOf(0, 1, 2, 4, 5, 6)

    val result = summaryRanges(nums)

    result.forEach {
        println(it)
    }
}

/**
 * 0, 1, 2, 4, 5, 6
 *          s
 *                   r
 */

private fun summaryRanges(nums: IntArray): List<String> {
    var start = 0
    var r = 1

    val ranges = mutableListOf<String>()

    while (r <= nums.size) {
        if (r < nums.size && nums[r] - nums[r - 1] == 1) {
            r++
        } else {
            val range = createRange(nums[start], nums[r - 1])
            ranges.add(range)
            start = r
            r++
        }
    }

    return ranges
}

private fun createRange(s: Int, e: Int): String {
    return if (s == e) {
        "$s"
    } else {
        "$s->$e"
    }
}