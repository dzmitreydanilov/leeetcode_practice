package com.ddanilov.topQestions

fun main() {
    val nums = intArrayOf(1, 12, -5, -6, 50, 3)
    val k = 4

    println(findMaxAverage(nums, k))
}

private fun findMaxAverage(nums: IntArray, k: Int): Double {
    var l = 0
    var r = k
    var sum = 0

    for (i in 0 until k) {
        sum += nums[i]
    }
    var maxSum = sum

    while (r < nums.size) {
        sum -= nums[l]
        l++

        sum += nums[r]
        r++

        maxSum = maxOf(sum, maxSum)
    }

    return maxSum / k.toDouble()
}
