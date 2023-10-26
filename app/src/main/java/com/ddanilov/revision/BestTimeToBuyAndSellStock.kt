package com.ddanilov.revision

fun main() {
    val prices = intArrayOf(7, 1, 5, 3, 6, 4)
    val result = maxProfit(prices)

    println(result)
}

// SC O(1)
// TC O(n)
private fun maxProfit(prices: IntArray): Int {
    var maxProfit = 0
    var l = 0 // buy
    var r = 1 // sell

    while (r < prices.size) {
        if(prices[l] < prices[r]) {
            val transactionProfit = prices[r] - prices[l]
            maxProfit = maxOf(transactionProfit, maxProfit)
        } else {
          l = r
        }

        r++
    }

    return  maxProfit
}
