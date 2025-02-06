package com.ddanilov.topQestions

import kotlin.math.abs

fun main() {
    val nums = intArrayOf(4, 3, 2, 7, 8, 2, 3, 1)
    println(findDisappearedNumbers(nums).joinToString(" "))
}

//0 1 2 3 4 5 6 7 indices
//4 -3 -2 7 8 2 3 1 values
// 4
// 4 - 1 = 3
private fun findDisappearedNumbers(nums: IntArray): List<Int> {
    val answer = mutableListOf<Int>()
    for (i in nums.indices) {
        val position = abs(nums[i]) - 1
        if (nums[position] < 0) continue

        nums[position] *= -1
    }

    for(i in nums.indices) {
        if (nums[i] > 0) {
            answer.add(i + 1)
        }
    }

    return answer
}
