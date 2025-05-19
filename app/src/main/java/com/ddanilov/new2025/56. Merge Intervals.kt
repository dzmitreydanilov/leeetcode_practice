package com.ddanilov.new2025

import java.util.Arrays

fun main() {
    val intervals = listOf<IntArray>(
        intArrayOf(1, 3),
        intArrayOf(2, 6),
        intArrayOf(8, 10),
        intArrayOf(15, 18),
    )

    val result = merge(intervals.toTypedArray())


    result.forEach {
        println("")
        it.forEach {
            println(it)
        }
    }

}

private fun merge(intervals: Array<IntArray>): Array<IntArray> {
    intervals.sortBy { it[0] }

    val result = mutableListOf<IntArray>(intervals[0])

    for (i in 1 until intervals.size) {
        val (start, end) = intervals[i]
        val previousRange = result[result.lastIndex]
        if (start <= previousRange[1]) {
            previousRange[1] = maxOf(previousRange[1], end)
        } else {
            result.add(intArrayOf(start, end))
        }
    }

    return result.toTypedArray()
}