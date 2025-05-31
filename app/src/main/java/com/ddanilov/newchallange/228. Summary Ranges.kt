package com.ddanilov.newchallange

fun main() {
    val nums = intArrayOf(0, 1, 2, 4, 5, 7)

    val result = summaryRanges(nums)

    result.forEach {
        println(it)
    }
}

/**
 * 0, 1, 2, 4, 5, 7
 *                s
 *                   r
 *
 * [0->2],[4->5],
 */

private fun summaryRanges(nums: IntArray): List<String> {
    var start = 0
    var r = 1

    val ranges = mutableListOf<String>()

    println(nums.size)

    while (r <= nums.size) {
        if (r < nums.size && nums[r] - nums[r - 1] == 1) {
            r++
        } else {
            val range = generateRange(nums[start], nums[r - 1])
            start = r
            r++
            ranges.add(range)
        }
    }

    return ranges
}

private fun generateRange(s: Int, e: Int): String {
    return if (s == e) {
        "$s"
    } else {
        "$s->$e"
    }
}