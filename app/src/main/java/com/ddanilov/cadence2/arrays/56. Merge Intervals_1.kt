package com.ddanilov.cadence2.arrays

fun main() {
    val intervals = arrayOf<IntArray>(
        intArrayOf(1, 8),
        intArrayOf(2, 6),
        intArrayOf(8, 10),
        intArrayOf(15, 18)
    )

    val result = merge(intervals)

    result.forEach {
        println(it)
    }
}

private fun merge(intervals: Array<IntArray>): Array<IntArray> {
    intervals.sortBy { it[0] }
    val answer = mutableListOf(intervals[0])

    for (i in 1..intervals.lastIndex) {
        val prev = answer[answer.lastIndex]
        val current = intervals[i]

        if (current[0] <= prev[1]) {
            prev[1] = maxOf(current[1], prev[1])
        } else {
            answer.add(current)
        }
    }

    return answer.toTypedArray()
}