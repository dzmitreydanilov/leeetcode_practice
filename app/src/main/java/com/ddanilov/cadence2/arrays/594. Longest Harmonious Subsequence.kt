package com.ddanilov.cadence2.arrays

fun main() {
    val nums = intArrayOf(1, 3, 2, 2, 5, 2, 3, 7)

    val result = findLHS(nums)

    println(result)
}

/**
 * {
 *  1: 1
 *  3: 2
 *  4: 5
 *  5: 1
 *
 */
private fun findLHS(nums: IntArray): Int {
    var answer = 0
    val map = mutableMapOf<Int, Int>()

    nums.forEach {
        map[it] = 1 + map.getOrDefault(it, 0)
    }

    nums.forEach {
        if (map.contains(it + 1)) {
            val i = map[it]!!
            val j = map[it + 1]!!
            val curr = i + j
            answer = maxOf(curr, answer)
        }
    }

    return answer
}