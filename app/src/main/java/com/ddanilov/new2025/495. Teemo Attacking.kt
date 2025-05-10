package com.ddanilov.new2025


fun main() {
    val timeSeries = intArrayOf(1, 2, 4)
    val duration = 2

    val result = findPoisonedDuration(timeSeries, duration)

    println(result)
}

private fun findPoisonedDuration(timeSeries: IntArray, duration: Int): Int {
    var result = 0
    for (i in 1 until timeSeries.size) {
        val temp = timeSeries[i - 1]
        result += minOf(timeSeries[i] - temp, duration)
    }
    return result + duration
}