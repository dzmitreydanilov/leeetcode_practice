package com.ddanilov.topQestions

fun main() {
    val prices = intArrayOf(7, 1, 5, 3, 6, 4)

    println(maxProfit(prices))
}

private fun maxProfit(prices: IntArray): Int {
    var max = 0
    var buy = 0
    var sell = 1

    while (sell < prices.size) {
        if (prices[sell] > prices[buy]) {
            val profit = prices[sell] - prices[buy]
            max = maxOf(max, profit)
        } else {
            buy = sell
        }
        sell++
    }
    return max
}
