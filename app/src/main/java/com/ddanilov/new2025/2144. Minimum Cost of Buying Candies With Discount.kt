package com.ddanilov.new2025

import java.util.Arrays
import kotlin.math.min

fun main() {
    val cost = intArrayOf(6, 5, 7, 9, 2, 2)
    val result = minimumCost(cost)

    println(result)

}

/**
 * 6,5,7,9,2,2
 *
 * 2,2,5,6,7,9
 *         l r
 *
 * 9, 7, 6, 5, 2, 2
 */
private fun minimumCost(cost: IntArray): Int {
    Arrays.sort(cost)
    cost.reverse()

    var minCost = 0
    for (i in cost.lastIndex downTo 0) {
        if (i % 3 != 2) {
            minCost += cost[i]
        }
    }
    return minCost
}