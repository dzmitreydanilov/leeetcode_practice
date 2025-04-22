package com.ddanilov.new2025

import kotlin.math.min

fun main() {
    val candyType = intArrayOf(1, 1, 2, 2, 3, 3)

    val result = distributeCandies(candyType)

    println(result)
}

/**
 * 1, 1, 2, 2, 3, 3,4,5,6,8,9
 *
 * allowed = 3
 * 1,2,3,4,5,6,8,9
 *
 */
private fun distributeCandies(candyType: IntArray): Int {
    val allowedCandies = candyType.size / 2
    val uniqueCandies = candyType.toSet().size

    return minOf(allowedCandies, uniqueCandies)
}
