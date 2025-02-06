package com.ddanilov.algo_learning.arrays


fun main() {
    val array = listOf(-1, 1, 2, 3, 1)
    val target = 2

    val result = countPairs(array, target)

    println(result)
}

private fun countPairs(nums: List<Int>, target: Int): Int {
    var count = 0
    for (i in nums.indices) {
        for (j in i + 1 until nums.size) {
            if (nums[i] + nums[j] < target) {
                count++
            }
        }
    }
    return count
}
