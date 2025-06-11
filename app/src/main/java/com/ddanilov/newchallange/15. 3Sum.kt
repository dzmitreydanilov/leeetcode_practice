package com.ddanilov.newchallange

fun main() {
    val nums = intArrayOf(-1, 0, 1, 2, -1, -4)

    val result = threeSum(nums)

    result.forEach { innerList ->
        println(innerList)
    }
}

private fun threeSum(nums: IntArray): List<List<Int>> {
        return emptyList()
}