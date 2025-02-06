package com.ddanilov.topQestions

fun main() {
    val nums = intArrayOf(2, 1, 3, 4)
    val result = productExceptSelf(nums)

    println(result.joinToString(" "))
}

private fun productExceptSelf(nums: IntArray): IntArray {
    val left = IntArray(nums.size)
    val right = IntArray(nums.size)
    // fill left array prefix
    left[0] = 1
    for (i in 1 until nums.size) {
        left[i] = left[i - 1] * nums[i - 1]
    }
    // fill right array postfix
    for (i in nums.lastIndex - 1 downTo 0) {
        right[i] = right[i + 1] * nums[i + 1]
    }
    val result = IntArray(nums.size)
    for (i in nums.indices) {
        result[i] = left[i] * right[i]
    }

    return  result
}
