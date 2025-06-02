package com.ddanilov.newchallange

fun main() {
    val candyTypes = intArrayOf(1, 1, 2, 2, 3, 3)

    val result = distributeCandies(candyTypes)

    print(result)
}

/**
 * 1, 1, 2, 2, 3, 3
 */
private fun distributeCandies(candyType: IntArray): Int {
    val uniqueCandies = candyType.toSet()

    return minOf(candyType.size / 2, uniqueCandies.size)
}