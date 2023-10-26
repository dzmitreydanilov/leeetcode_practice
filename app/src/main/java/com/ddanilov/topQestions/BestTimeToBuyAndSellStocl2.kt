package com.ddanilov.topQestions

import kotlin.math.max

fun main() {
    val prices = intArrayOf(7, 1, 5, 3, 6, 4)

    println(maxProfit(prices))
}

private fun maxProfit(prices: IntArray): Int {
    var maxProfit = 0

    for (i in 1 until prices.size) {
        if (prices[i] > prices[i - 1]) {
            maxProfit += prices[i] - prices[i - 1]
        }
    }

    return maxProfit
}
