package com.ddanilov.cadence2.arrays

fun main() {

    val height = intArrayOf(1, 8, 6, 2, 5, 4, 8, 3, 7)

    val result = maxArea(height)

    print(result)
}

private fun maxArea(height: IntArray): Int {
    var l = 0
    var r = height.lastIndex
    var maxL = height[l]
    var maxR = height[r]
    var answer = 0

    while (l < r) {
        val new = (r - l) * minOf(maxL, maxR)
        answer = maxOf(new, answer)
        if (maxL <= maxR) {
            l++
            maxL = maxOf(maxL, height[l])
        } else {
            r--
            maxR = maxOf(maxR, height[r])
        }
    }

    return answer
}