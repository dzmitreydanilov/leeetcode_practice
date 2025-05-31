package com.ddanilov.newchallange

fun main() {
    val timeSeries = intArrayOf(1, 2, 4, 5, 7)
    val d = 2

    val result = findPoisonedDuration(timeSeries, d)

    print(result)
}


/**
 *
 */
private fun findPoisonedDuration(timeSeries: IntArray, duration: Int): Int {
    var result = 0

    for (i in 1 until timeSeries.size) {
        val actualDuration = timeSeries[i] - timeSeries[i - 1]
        result += minOf(actualDuration, duration)
    }

    return result + duration
}