package com.ddanilov.topQestions

fun main() {
    val prices = intArrayOf(7, 1, 5, 3, 6, 4)
    println(maxProfit(prices))
}

private fun maxProfit(prices: IntArray): Int {
    var maxProfit = 0
    var l = 0 //buy
    var r = 1 //sell

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
