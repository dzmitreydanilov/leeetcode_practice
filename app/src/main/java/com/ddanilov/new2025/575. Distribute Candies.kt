package com.ddanilov.new2025

fun main() {

    val cT = intArrayOf(1, 1, 2, 2, 3, 3)
    val result = distributeCandies(cT)

    println(result)

}

/**
 * 1, 1, 2, 2, 3, 3
 *
 * 1,2,3
 *
 * maxCount = 3
 */
private fun distributeCandies(candyType: IntArray): Int {
    val candiesSet = candyType.toSet().size
    val allowedCandies = candyType.size / 2

    return minOf(candiesSet, allowedCandies)
}