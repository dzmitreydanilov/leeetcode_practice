package com.ddanilov.new2025.repeate

fun main() {
    val prices = intArrayOf(7, 1, 5, 3, 6, 4)

    val result = maxProfit(prices)

    println(result)
}


/**
 * 7, 1, 5, 3, 6, 4
 *    l
 *                 r
 */
private fun maxProfit(prices: IntArray): Int {
    var max = 0
    var (l, r) = 0 to 0
    while (r < prices.size) {
        if (prices[r] - prices[l] > 0) {
            val profit = prices[r] - prices[l]
            max = maxOf(max, profit)
        } else {
            l = r
        }
        r++
    }

    return max
}