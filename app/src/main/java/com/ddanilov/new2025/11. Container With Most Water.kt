package com.ddanilov.new2025

import kotlin.math.max
import kotlin.math.min

fun main() {
    val height = intArrayOf(1, 8, 6, 2, 5, 4, 8, 3, 7)
    val result = maxArea(height)

    println(result)
}

/**
 * 1, 8, 6, 2, 5, 4, 8, 3, 7
 * l
 *     r
 */
private fun maxArea(height: IntArray): Int {
    var max = 0
    for (i in height.indices) {
        for (j in i + 1 until height.size) {
            val area = (j - i) * minOf(height[i], height[j])
            max = maxOf(max, area)
        }
    }

    return max
}