package com.ddanilov.new2025.repeate

fun main() {

    val prices = intArrayOf(7,6,4,3,1)
    val result = maxProfit(prices)

    println("XXX $result")
}

/**
 * 7,6,4,3,1
 *         l
 *         r
 */
private fun maxProfit(prices: IntArray): Int {
    var max = 0
    var b = 0
    var s = 1

    while (s < prices.size) {
        if (prices[s] > prices[b]) {
            val profit = prices[s] - prices[b]
            max = maxOf(max, profit)
        } else {
            b = s
        }

        s++
    }

    return max
}