package com.ddanilov.new2025

fun main() {

    val timeSeries = intArrayOf(1, 2, 4)
    val duration = 2

    val result = findPoisonedDuration(timeSeries, duration)

    print(result)

}

private fun findPoisonedDuration(timeSeries: IntArray, duration: Int): Int {
    var poisonedFor = 0
    for (i in 1 until timeSeries.size) {
        poisonedFor += minOf(timeSeries[i] - timeSeries[i - 1], duration)
    }

    return poisonedFor + duration
}