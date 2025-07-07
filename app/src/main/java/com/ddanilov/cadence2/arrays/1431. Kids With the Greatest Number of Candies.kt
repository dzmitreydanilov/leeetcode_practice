package com.ddanilov.cadence2.arrays

import kotlin.math.max

fun main() {
    val candies = intArrayOf(2, 3, 5, 1, 3)
    val extraCandies = 3

    val result = kidsWithCandies(candies, extraCandies)

    result.forEach {
        println(it)
    }
}

/**
 *
 *
 * [f,f,t,f,f]
 *
 */
private fun kidsWithCandies(candies: IntArray, extraCandies: Int): List<Boolean> {
    val answer = Array(candies.size) { false }
    val maxCandies = candies.max()

    for (i in candies.indices) {
        if (candies[i] + extraCandies >= maxCandies) {
            answer[i] = true
        }
    }

    return answer.toList()
}
