package com.ddanilov.cadence2.arrays

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
 *                   i
 */
private fun summaryRanges(nums: IntArray): List<String> {
    var start = 0
    var i = 1
    val answer = mutableListOf<String>()

    while (i <= nums.size) {
        if (i == nums.size || nums[i] - nums[i - 1] != 1) {
            val interval = buildInterval(nums[start], nums[i - 1])
            answer.add(interval)
            start = i
        }
        i++
    }

    return answer
}

private fun buildInterval(s: Int, end: Int): String {
    return if (s == end) {
        "$s"
    } else {
        "$s->$end"
    }
}