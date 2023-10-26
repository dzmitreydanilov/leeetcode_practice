package com.ddanilov.algo_learning.arrays

fun main() {
    val array = intArrayOf(1, 2, 3)
    val result = getConcatenation(array)

    println(result.joinToString(""))
}

// TC O(n)
// SC O(n)
private fun getConcatenation(nums: IntArray): IntArray {
    val arraySize = nums.size
    val resultArray = IntArray(arraySize * 2)
    for (i in nums.indices) {
        resultArray[i] = nums[i]
        resultArray[arraySize + i] = nums[i]
    }

    return resultArray
}
