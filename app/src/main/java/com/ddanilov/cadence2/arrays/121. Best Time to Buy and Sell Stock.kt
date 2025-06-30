package com.ddanilov.cadence2.arrays

fun main() {
    val prices = intArrayOf(1, 2, 4, 2, 5, 7, 2, 4, 9, 0, 9)

    val result = maxProfit(prices)

    println(result)
}

/**
 * 1, 2, 4, 2, 5, 7, 2, 4, 9, 0, 9
 * b
 *                            s
 *
 * m = 7
 */

private fun maxProfit(prices: IntArray): Int {
    var b = 0
    var s = 1

    var answer = 0

    while (s < prices.size) {
        if (prices[b] < prices[s]) {
            val diff = prices[s] - prices[b]
            answer = maxOf(diff, answer)
        } else {
            b = s
        }
        s++
    }

    return answer
}