package com.ddanilov.newchallange

fun main() {
    val intervals = arrayOf(
        intArrayOf(1, 3),
        intArrayOf(2, 6),
        intArrayOf(8, 10),
        intArrayOf(9, 18),
    )

    val result = merge(intervals)

    for (interval in result) {
        println("[${interval[0]}, ${interval[1]}]")
    }
}

/**
 * [1,3]
 * [2,6]
 * [8,10]
 * [9,18]
 */
private fun merge(intervals: Array<IntArray>): Array<IntArray> {
    val result = mutableListOf<IntArray>()

    intervals.sortBy { it[0] }

    result.add(intervals[0])

    for (i in 1 until intervals.size) {
        val (s, e) = intervals[i]
        val prev = result[result.lastIndex]

        if (s <= prev[1]) {
            prev[1] = maxOf(prev[1], e)
        } else {
            result.add(intArrayOf(s, e))
        }
    }

    return result.toTypedArray()
}