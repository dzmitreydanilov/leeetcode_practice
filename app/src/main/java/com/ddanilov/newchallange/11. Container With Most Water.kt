package com.ddanilov.newchallange

fun main() {
    val height = intArrayOf(1, 8, 6, 2, 5, 4, 8, 3, 7)

    val result = maxArea(height)

    println(result)
}

private fun maxArea(height: IntArray): Int {
            var l = 0
            var r = height.lastIndex
            var max = 0

            while (l < r) {
                val area = (r - l) * minOf(height[l], height[r])
                max = maxOf(area, max)
                if (height[l] <= height[r]) {
                    l++
                } else {
                    r--
                }
            }

            return max
}
