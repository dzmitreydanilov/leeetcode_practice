package com.ddanilov.algo_learning.arrays


fun main() {
    val array = intArrayOf(1, 0, 11, 12, 0, 41, 0)
    val result = moveZeroesToTheEnd1(array)

    println(result.joinToString(" "))
}

// Space complexity = O(n)
// Time complexity = O(n)
private fun moveZeroesToTheEnd(nums: IntArray): List<Int> {
    val notZeroArray = mutableListOf<Int>()
    val zeroArray = mutableListOf<Int>()

    nums.forEach { value ->
        if (value != 0) {
            notZeroArray.add(value)
        } else {
            zeroArray.add(value)
        }
    }
    return notZeroArray + zeroArray
}

//val array = intArrayOf(1, 0, 11, 12, 0, 41, 0)
//O(n)
//O(1)
private fun moveZeroesToTheEnd1(nums: IntArray): IntArray {
    var insertIndex = 0
    nums.forEach { value ->
        if (value != 0) {
            nums[insertIndex++] = value
        }
    }

    while (insertIndex < nums.size) {
        nums[insertIndex++] = 0
    }

    return nums
}
