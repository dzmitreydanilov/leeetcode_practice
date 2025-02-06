package com.ddanilov.topQestions

import kotlin.math.max
import kotlin.math.min

fun main() {
    val candyType = intArrayOf(1, 1, 2, 2, 3, 3)
}

private fun distributeCandies(candyType: IntArray): Int {
    val maxCandies = candyType.size / 2
    val typesSet = candyType.toSet()

    return min(typesSet.size, maxCandies)
}
