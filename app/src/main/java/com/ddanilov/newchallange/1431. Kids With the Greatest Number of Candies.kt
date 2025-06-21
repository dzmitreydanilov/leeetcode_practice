package com.ddanilov.newchallange

fun main() {
    val candies = intArrayOf(2, 3, 5, 1, 3)
    val extraCandies = 3

    val result = kidsWithCandies(candies, extraCandies)

    result.forEach {
        println(it)
    }
}

private fun kidsWithCandies(candies: IntArray, extraCandies: Int): List<Boolean> {
    val max = candies.max()
    val result = Array<Boolean>(candies.size) { false }

    for (i in candies.indices) {
        val maxCandies = candies[i] + extraCandies >= max
        result[i] = maxCandies
    }

    return result.toList()
}