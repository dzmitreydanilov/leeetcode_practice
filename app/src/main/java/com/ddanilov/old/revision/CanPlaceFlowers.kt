package com.ddanilov.revision

fun main() {
    val nums = intArrayOf(1, 0, 0, 0, 0, 1)
    val n = 1
    val result = canPlaceFlowers1(nums, n)

    println(result)
}

// TC O(n)
// SC O(n)
private fun canPlaceFlowers(flowerbed: IntArray, n: Int): Boolean {
    var flowersToPlantLeft = n
    val flowers = intArrayOf(0) + flowerbed + intArrayOf(0)
    for (i in 1 until flowers.size - 1) {
        if (flowers[i - 1] == 0 && flowers[i] == 0 && flowers[i + 1] == 0) {
            flowers[i] = 1
            flowersToPlantLeft--
        }
    }

    return flowersToPlantLeft <= 0
}

//1,0,0,0,0,1
// TC O(N)
// SC O(1)
private fun canPlaceFlowers1(flowerbed: IntArray, n: Int): Boolean {
    if (n == 0) return true
    var flowersToPlantLeft = 0
    var index = 0

    while (index < flowerbed.size) {
        if (flowerbed[index] == 0
            && (index == 0 || flowerbed[index - 1] == 0)
            && (index == flowerbed.size - 1 || flowerbed[index + 1] == 0)
        ) {
            flowersToPlantLeft++

            if (flowersToPlantLeft == n) return true
            // Skip the next iteration
            index += 2
        } else {
            index++
        }
    }
    return false
}
