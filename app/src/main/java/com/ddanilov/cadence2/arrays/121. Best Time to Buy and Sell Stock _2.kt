package com.ddanilov.cadence2.arrays

import kotlin.math.max

fun main() {
    val prices = intArrayOf(7, 1, 5, 3, 6, 4)
    val res = maxProfit(prices)

    print(res)
}

/**
 * 7, 1, 5, 3, 6, 4
 * b
 *    s
 * answer - 0
 */
private fun maxProfit(prices: IntArray): Int {
    var b = 0
    var s = 1
    var answer = 0

    while (s < prices.size) {
        val transaction = prices[s] - prices[b]
        if (transaction >= 0) {
            answer = maxOf(answer, transaction)
        } else {
            b = s
        }
        s++
    }

    return answer
}