package com.ddanilov.new2025


fun main() {
    val prices = intArrayOf(7, 1, 5, 3, 6, 4)
    val result = maxProfit(prices)

    println("XXX $result")
}

/**
 * 7,1,5,3,6,4
 */

fun maxProfitBrut(prices: IntArray): Int {
    var maxProfit = 0

    for (b in prices.indices) {
        for (c in b + 1 until prices.size) {
            val profit = prices[c] - prices[b]
            if (profit > maxProfit) {
                maxProfit = profit
            }
        }
    }
    return maxProfit
}

fun maxProfit(prices: IntArray): Int {
    var max = 0
    var l = 0
    var r = 1

    while (r < prices.size) {
        if (prices[l] < prices[r]) {
            val profit = prices[r] - prices[l]
            max = maxOf(profit, max)
        } else {
            l = r
        }
        r++
    }
    return max
}