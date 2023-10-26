package com.ddanilov.topQestions

import kotlin.math.max

fun main() {
    val prices = intArrayOf(7, 1, 5, 3, 6, 4)

    println(maxProfit(prices))
}

private fun maxProfit(prices: IntArray): Int {
    var l = 0 // buy
    var r = 1 // cell
    var maxProfit = 0

    while (r < prices.size) {
        if (prices[l] < prices[r]) {
            val transactionProfit = prices[r] - prices[l]
            maxProfit = maxOf(transactionProfit, maxProfit)
        } else {
            l = r
        }

        r++
    }

    return maxProfit
}
