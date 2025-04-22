package com.ddanilov.new2025

fun main() {
    val height = intArrayOf(0, 0, 0, 1, 0, 0, 0)

    val result = trap(height)

    println(result)
}

/**
 * 0, 0, 0, 1, 0, 0, 0
 *          r
 *          l
 * 0  0  0  0   0  0  0
 * val maxL = 0
 * val maxR = 0
 */
private fun trap(height: IntArray): Int {

    var l = 0
    var r = height.lastIndex

    var maxL = height[l]
    var maxR = height[r]

    var result = 0

    while (l < r) {
        if (maxL <= maxR) {
            l++

            maxL = maxOf(maxL, height[l])
            result += maxL - height[l]
        } else {
            r--
            maxR = maxOf(maxR, height[r])
            result += maxR - height[r]
        }
    }

    return result
}
