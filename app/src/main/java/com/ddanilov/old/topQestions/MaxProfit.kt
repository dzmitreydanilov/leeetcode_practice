package com.ddanilov.topQestions

fun main() {
    val prices = intArrayOf(1, 7, 5, 3, 6, 4)

    println(maxProfit(prices))
}

private fun maxProfit(prices: IntArray): Int {
    var max = 0
    var sell = 1
    var buy = 0

    while (sell < prices.size) {
        if (prices[sell] > prices[buy]) {
            val profit = prices[sell] - prices[buy]
            max = maxOf(profit, max)
        } else {
            buy = sell
        }
        sell++
    }

    return max
}
