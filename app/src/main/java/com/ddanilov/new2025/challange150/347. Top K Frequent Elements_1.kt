package com.ddanilov.new2025.challange150

fun main() {
    val nums = intArrayOf(1, 1, 1, 2, 2, 3)
    val k = 2

    val result = topKFrequent(nums, k)

    result.forEach {
        println(it)
    }
}

/**
 * 1, 1, 1, 2, 2,22, 3
 *
 * {
 *  1 : 3
 *  2: 3
 *  3: 1
 * }
 *
 *   0    1    2      3      4     5
 * [  ] [ 3 ] [ ] [ 1, 2 ] [   ] [   ]
 */
private fun topKFrequent(nums: IntArray, k: Int): IntArray {
    val map = mutableMapOf<Int, Int>()
    // IF SIZE 1, WE NEED
    val frequency = MutableList<MutableList<Int>>(nums.size + 1) { mutableListOf() }

    nums.forEach {
        map[it] = 1 + map.getOrDefault(it, 0)
    }

    for ((value, count) in map) {
        frequency[count].add(value)
    }

    val result = mutableListOf<Int>()

    for (i in frequency.lastIndex downTo 0) {
        frequency[i].forEach { value ->
            if (result.size < k) {
                result.add(value)
            } else {
                return@forEach
            }
        }
    }

    return result.toIntArray()
}