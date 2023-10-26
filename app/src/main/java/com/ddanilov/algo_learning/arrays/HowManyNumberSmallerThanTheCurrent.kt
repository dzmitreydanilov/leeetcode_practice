package com.ddanilov.algo_learning.arrays

fun main() {
    val array = intArrayOf(8, 1, 2, 2, 3)
    val result = smallerNumbersThanCurrent(array)

    println(result.joinToString(" "))
}

// TC O(n^2)
// SC O(n)
private fun smallerNumbersThanCurrent(nums: IntArray): IntArray {
    var count = 0
    val resultArray = IntArray(nums.size)
    for (i in nums.indices) {
        count = 0
        for (j in nums.indices) {
            if (nums[i] > nums[j]) {
                count++
            }
        }

        resultArray[i]= count
    }

    return resultArray
}
