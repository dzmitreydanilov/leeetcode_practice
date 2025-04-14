package com.ddanilov.new2025

fun main() {
    val nums = intArrayOf(1, 4)
    val duration = 2

    val result = findPoisonedDuration(nums, duration)

    println("XXX $result")
}


/**
 * 1, 4
 *
 */
private fun findPoisonedDuration(timeSeries: IntArray, duration: Int): Int {
    var result = 0

    for (i in timeSeries.indices - 1) {
        result += minOf(timeSeries[i + 1] - timeSeries[i], duration)
    }

    return result + duration
}

