package com.ddanilov.new2025.challange150

fun main() {
    val prices = intArrayOf(1,2)
    val result = maxProfit(prices)

    println(result)
}

/**
 * 1, 2
 * b
 *    s
 */
private fun maxProfit(prices: IntArray): Int {
    var b = 0
    var maxProfit = 0
    for (s in 1 until prices.size) {
        if (prices[s] > prices[b]) {
            val operationResult = prices[s] - prices[b]
            maxProfit = maxOf(operationResult, maxProfit)
        } else {
            b = s
        }
    }

    return maxProfit
}