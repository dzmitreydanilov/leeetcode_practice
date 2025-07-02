package com.ddanilov.cadence2.arrays

fun main() {
    val intervals = arrayOf(
        intArrayOf(1,4),
        intArrayOf(0, 4),
    )

    val result = merge(intervals)

    result.forEach {
        println(it)
    }
}

private fun merge(intervals: Array<IntArray>): Array<IntArray> {
    intervals.sortBy { it[0] }
    val answer = mutableListOf<IntArray>(intervals[0])

    for (i in 1..intervals.lastIndex) {
        val (start, end) = intervals[i]
        val previousInterval = answer[answer.lastIndex]
        if (start <= previousInterval[1]) {
            previousInterval[1] = maxOf(end, previousInterval[1])
        } else {
            answer.add(intervals[i])
        }
    }

    return answer.toTypedArray()
}