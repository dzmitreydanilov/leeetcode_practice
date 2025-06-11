package com.ddanilov.newchallange

import kotlin.math.max

fun main() {
    val height = intArrayOf(4, 2, 0, 3, 2, 5)

    val result = trap(height)

    println(result)
}

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