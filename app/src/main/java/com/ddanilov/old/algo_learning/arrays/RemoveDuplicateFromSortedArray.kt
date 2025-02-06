package com.ddanilov.algo_learning.arrays

fun main() {
    val nums = intArrayOf(0, 0, 1, 1, 1, 2, 2, 3, 3, 4)
    val result = removeDuplicates(nums)

    println(result)
}

private fun removeDuplicates(nums: IntArray): Int {
    if (nums.isEmpty()) return 0
    var pointerL = 1

    for (i in 1..<nums.size) {
        if (nums[i] != nums[i - 1]) {
            nums[pointerL] = nums[i]
            pointerL++
        }
    }
    return pointerL
}
