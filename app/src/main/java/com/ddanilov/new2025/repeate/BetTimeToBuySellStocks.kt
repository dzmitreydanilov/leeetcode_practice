package com.ddanilov.new2025.repeate

fun main() {

    val prices = intArrayOf(7, 1, 5, 3, 6, 4)

    val result = maxProfit(prices)

    println("XXX $result")
}

/**
 * 7,6,4,3,1
 *       l
 *         r
 */
private fun maxProfit(prices: IntArray): Int {
    var max = 0
    var l = 0
    var r = 1

    while (r < prices.size) {
        if (prices[r] > prices[l]) {
            val profit = prices[r] - prices[l]
            max = maxOf(profit, max)
        } else {
            l = r
        }

        r++
    }

    return max
}