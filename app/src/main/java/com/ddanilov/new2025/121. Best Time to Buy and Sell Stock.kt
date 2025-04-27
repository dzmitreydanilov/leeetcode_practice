package com.ddanilov.new2025

fun main() {
    val prices = intArrayOf(7, 1, 5, 3, 6, 4)
    val result = maxProfit(prices)

    println(result)
}

/**
 * 7, 1, 5, 3, 6, 4
 *    b
 *        s
 */
private fun maxProfit(prices: IntArray): Int {
    var b = 0
    var maxProfit = 0
    for (s in 1 until prices.size) {
        if (prices[s] - prices[b] > 0) {
            val currentProfit = prices[s] - prices[b]
            maxProfit = maxOf(maxProfit, currentProfit)
        } else {
            b = s
        }
    }

    return maxProfit
}
