package com.ddanilov.revision

import kotlin.math.abs

fun main() {
    val nums = intArrayOf(4, 3, 2, 7, 8, 2, 3, 1)
    val result = findDisappearedNumbers1(nums = nums)
    println(result.joinToString(""))
}

// TC o(n^2)
// SC O(n)
private fun findDisappearedNumbers(nums: IntArray): List<Int> {
    val range = 1..nums.size
    val resultArray = mutableListOf<Int>()
    range.forEach {
        if (!nums.contains(it)) {
            resultArray.add(it)
        }
    }

    return resultArray
}

// -4, -3, -2, -7, 8, 2, -3, -1
//  0,  1,  2,  3, 4, 5,  6,  7
private fun findDisappearedNumbers1(nums: IntArray): List<Int> {
    val resultList = mutableListOf<Int>()
    for (i in nums.indices) {
        val index = abs(nums[i]) - 1
        if (nums[index] < 0) {
            continue
        }
        nums[index] *= -1
    }

    for (i in nums.indices) {
        if (nums[i] > 0) {
            resultList.add(i + 1)
        }
    }

    return resultList

}
