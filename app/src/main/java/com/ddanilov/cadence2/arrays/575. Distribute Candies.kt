package com.ddanilov.cadence2.arrays

fun main() {
    val candyType = intArrayOf(1, 1, 2, 2, 3, 3)

    val result = distributeCandies(candyType)

    println(result)
}

private fun distributeCandies(candyType: IntArray): Int {
    val uniqueCandies = candyType.toSet()

    return if (uniqueCandies.size > candyType.size / 2) candyType.size / 2 else candyType.size
}