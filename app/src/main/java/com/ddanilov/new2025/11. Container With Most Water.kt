package com.ddanilov.new2025


fun main() {
    val height = intArrayOf(1, 8, 6, 2, 5, 4, 8, 3, 7)
    val result = maxArea(height)

    println(result)
}

/**
 * Brut force
 * 1, 8, 6, 2, 5, 4, 8, 3, 7
 *                l
 *                   r
 */
private fun maxAreaBF(height: IntArray): Int {
    var max = 0
    for (i in height.indices) {
        for (j in i + 1 until height.size) {
            val area = (j - i) * minOf(height[i], height[j])
            max = maxOf(max, area)
        }
    }

    return max
}

private fun maxArea(height: IntArray): Int {
    var max = 0
    var l = 0
    var r = height.lastIndex

    while (l < r) {
        // 6 - 4 = 2
        // minH = 5
        // 10
        val area = (r - l) * minOf(height[r], height[l])
        println(area)
        max = maxOf(max, area)

        if (height[l] <= height[r]) {
            l++
        } else {
            r--
        }
    }
    return max
}