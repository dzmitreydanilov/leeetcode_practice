package com.ddanilov.cadence2.arrays

fun main() {
    val timeSeries = intArrayOf(1, 2, 4)
    val duration = 2

    val result = findPoisonedDuration(timeSeries, duration)

    println(result)
}

/**
 *
 */
private fun findPoisonedDuration(timeSeries: IntArray, duration: Int): Int {
    var answer = 0
    for (i in 1..timeSeries.lastIndex) {
        answer += minOf(timeSeries[i] - timeSeries[i - 1], duration)
    }

    return answer + duration
}