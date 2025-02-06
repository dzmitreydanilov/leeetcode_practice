package com.ddanilov.topQestions

fun main() {
    val candyType = intArrayOf(1, 1, 2, 2, 3, 3)

    println(distributeCandies(candyType))
}

private fun distributeCandies(candyType: IntArray): Int {
    val canEat = candyType.size / 2
    val typesSet = candyType.toHashSet()

    return minOf(typesSet.size, canEat)
}
