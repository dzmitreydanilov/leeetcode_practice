package com.ddanilov.new2025

fun main() {
    val flowerbed = intArrayOf(1, 0, 0, 0, 1, 0, 0)
    val n = 2

    val result = canPlaceFlowers(flowerbed, n)

    println(result)
}


/**
 * 0, 1, 0, 0, 0, 1, 0, 0, 0
 *
 */
private fun canPlaceFlowers(flowerbed: IntArray, n: Int): Boolean {
    var count = n

    val tempArray = intArrayOf(0) + flowerbed + intArrayOf(0)
    for (i in 1..flowerbed.size) {
        if (tempArray[i] == 0 && tempArray[i - 1] == 0 && tempArray[i + 1] == 0) {
            tempArray[i] = 1
            count--
        }
    }


    return count <= 0
}
