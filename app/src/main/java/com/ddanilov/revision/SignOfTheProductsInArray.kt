package com.ddanilov.revision

fun main() {
    val nums = intArrayOf(-1, -2, -3, -4, 3, 2, 1)
    val result = arraySign(nums)

    println(result)
}

private fun arraySign(nums: IntArray): Int {
    var negativeCount = 0

    nums.forEach {
        if (it == 0) return 0
        negativeCount += if (it < 0) 1 else 0
    }

    return if (negativeCount % 2 == 0) 1 else -1
}
