package com.ddanilov.cadence2.arrays

import android.database.Cursor

fun main() {
    val flowerbed = intArrayOf(1, 0, 0, 0, 1)
    val n = 1

    val result = canPlaceFlowers(flowerbed, n)

    println(result)
}


/**
 * 0,1,0,0,0,1,0
 *       i
 * 0, 0, 1, 0, 0
 *
 * 0, 0, 0, 1, 0, 0, 0
 *    i
 */
private fun canPlaceFlowers(flowerbed: IntArray, n: Int): Boolean {
    val customFlowerBad = intArrayOf(0) + flowerbed + intArrayOf(0)
    var putGoal = n

    for (i in 1..customFlowerBad.lastIndex - 1) {
        if (customFlowerBad[i - 1] == 0 && customFlowerBad[i + 1] == 0) {
            if (customFlowerBad[i] == 0) {
                customFlowerBad[i] = 1
                putGoal--
            }
        }
    }

    return putGoal <= 0
}
