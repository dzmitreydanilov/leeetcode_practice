package com.ddanilov.newchallange

fun main() {
    val nums = intArrayOf(1, 3, 2, 2, 5, 2, 3, 7)

    val result = findLHS(nums)

    print(result)
}

/**
 * 1:1
 * 3:2
 * 2:3
 * 5:1
 * 7:1
 *
 * answer = 0
 * 1
 * if(x+1) in keys
 *  best
 */
private fun findLHS(nums: IntArray): Int {
    var answer = 0
    val countMap = mutableMapOf<Int, Int>()
    nums.forEach {
        countMap[it] = 1 + countMap.getOrDefault(it, 0)
    }

    for (num in countMap.keys) {
        if (num + 1 in countMap) {
            answer = maxOf(answer, countMap[num]!! + countMap[num + 1]!!)
        }
    }

    return answer
}