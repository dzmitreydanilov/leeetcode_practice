package com.ddanilov.newchallange

fun main() {
    val flowerbed = intArrayOf(1, 0, 0, 1)
    val n = 1

    val result = canPlaceFlowers(flowerbed, n)

    print(result)

}

/**
 * [1,0,0,1]
 * [1,0,0,0,1]
 * [0,0,1]
 */
private fun canPlaceFlowers(flowerbed: IntArray, n: Int): Boolean {
    val f = intArrayOf(0) + flowerbed + intArrayOf(0)
    var leftToPlace = n
    for (i in 1 until f.size - 1) {
        if (f[i] == 0 && f[i - 1] == 0 && f[i + 1] == 0) {
            f[i] = 1
            leftToPlace--
        }
    }

    return leftToPlace <= 0
}