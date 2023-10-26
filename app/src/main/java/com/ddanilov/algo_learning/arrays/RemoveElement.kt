package com.ddanilov.algo_learning.arrays

fun main() {
    val array = intArrayOf(0, 1, 2, 2, 3, 0, 4, 2)
    val value = 2
    val result = removeElement(array, value)

    println(result)
}


private fun removeElement(nums: IntArray, `val`: Int): Int {
    if (nums.isEmpty()) return 0
    var validSize = 0

    for (i in nums.indices) {
        if (nums[i] != `val`) {
            nums[validSize] = nums[i]
            validSize++
        }
    }

    return validSize
}
