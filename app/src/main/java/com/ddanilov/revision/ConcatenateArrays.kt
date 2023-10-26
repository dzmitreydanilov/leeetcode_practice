package com.ddanilov.revision

fun main() {
    val nums = intArrayOf(1, 2, 3)
    val result = getConcatenation(nums)

    print(result.joinToString(""))
}

// Tc O(n)
// SC O(n)
private fun getConcatenation(nums: IntArray): IntArray {
    val size = nums.size
    val result = IntArray(size * 2)

    for(i in nums.indices) {
        result[i] = nums[i]
        result[i + size] = nums[i]
    }

    return result
}
