package com.ddanilov.newchallange

fun main() {
    val prices = intArrayOf(7, 1, 5, 3, 6, 4)
    val result = maxProfit(prices)

    println(result)
}


/**
 * 1, 2
 * b
 *    s
 *
 * m =
 */
private fun maxProfit(prices: IntArray): Int {
    var max = 0
    var b = 0
    var s = 1

    while (s <= prices.lastIndex) {
        if (prices[s] - prices[b] > 0) {
            val profit = prices[s] - prices[b]
            max = maxOf(max, profit)
            s++
        } else {
            b = s
            s++
        }
    }
    return max
}