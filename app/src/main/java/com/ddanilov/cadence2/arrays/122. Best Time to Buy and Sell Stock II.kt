package com.ddanilov.cadence2.arrays

fun main() {
    val prices = intArrayOf(7, 1, 5, 3, 6, 4)

    val result = maxProfit(prices)

    println(result)
}

/**
 * 7, 1, 5, 3, 6, 4
 *             b
 *                s
 */
private fun maxProfit(prices: IntArray): Int {
    var b = 0
    var profit = 0

    for (s in 1..prices.lastIndex) {
        if (prices[s] > prices[b]) {
            val transaction = prices[s] - prices[b]
            profit += transaction
        }
        b++
    }
    return profit
}
