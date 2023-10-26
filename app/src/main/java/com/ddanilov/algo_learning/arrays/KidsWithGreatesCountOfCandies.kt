package com.ddanilov.algo_learning.arrays

fun main() {
    val candies = intArrayOf(2, 3, 5, 1, 3)
    val extraCandies = 3
    val result = kidsWithCandies(candies, extraCandies)

    println(result.joinToString(" "))
}

//TC O(n)
// SC O(1)
private fun kidsWithCandies(candies: IntArray, extraCandies: Int): List<Boolean> {
    val maxCandiesCount = candies.max()
    val resultArray = mutableListOf<Boolean>()
    for (i in candies.indices) {
        val isBigger = candies[i] + extraCandies >= maxCandiesCount
        resultArray.add(isBigger)
    }

    return resultArray
}
