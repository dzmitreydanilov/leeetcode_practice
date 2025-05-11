package com.ddanilov.new2025

fun main() {
    val prices = intArrayOf(7,1,5,3,6,4 )

    val result = maxProfit(prices)

    println(result)
}

/**
 * 7, 1, 5, 3, 6, 4
 *    l
 *     r
 */
private fun maxProfit(prices: IntArray): Int {
    var max = 0
    for (r in 1 until prices.size) {
        if (prices[r] > prices[r - 1]) {
            max += prices[r] - prices[r - 1]
        }
    }

    return max
}