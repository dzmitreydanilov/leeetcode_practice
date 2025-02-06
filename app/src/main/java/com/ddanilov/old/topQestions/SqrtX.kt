package com.ddanilov.topQestions


fun main() {
    val x = 2147395599
    println(mySqrt(x))
}

private fun mySqrt(x: Int): Int {
    if (x == 0) return 0
    var left = 0
    var right = (x / 2) + 1

    while (left < right) {
        val mid = left + (right - left) / 2 + 1
        if (mid == x / mid) {
            return mid
        } else if (mid < x / mid) {
            left = mid
        } else {
            right = mid - 1
        }
    }
    return left
}

