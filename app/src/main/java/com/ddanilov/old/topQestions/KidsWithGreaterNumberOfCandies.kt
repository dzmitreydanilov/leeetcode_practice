package com.ddanilov.topQestions

fun main() {
    val candies = intArrayOf(2, 3, 5, 1, 3)
    val extraCandies = 3
}

private fun kidsWithCandies(candies: IntArray, extraCandies: Int): List<Boolean> {
    val maxCandies = candies.max()
    var answer = mutableListOf<Boolean>()
    for (i in candies.indices) {
        val isGreater = (candies[i] + extraCandies) >= maxCandies
        answer.add(isGreater)
    }

    return answer
}
