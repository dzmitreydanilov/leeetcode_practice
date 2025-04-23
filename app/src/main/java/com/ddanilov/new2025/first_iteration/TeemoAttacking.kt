package com.ddanilov.new2025.first_iteration

fun main() {
    val nums = intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9)
    val duration = 1

    val result = findPoisonedDuration(nums, duration)

    println("XXX $result")
}

/**
 * 1, 2, 3, 4, 5, 6, 7, 8, 9
 *
 * d = 2
 */
private fun findPoisonedDuration(timeSeries: IntArray, duration: Int): Int {
    var result = 0
    for (i in 0 until timeSeries.lastIndex) {
        val temp =timeSeries[i + 1]
        result += minOf(temp - timeSeries[i], duration)
    }

    return result + duration
}

