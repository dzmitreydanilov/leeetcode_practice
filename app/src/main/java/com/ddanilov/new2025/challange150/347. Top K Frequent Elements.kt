package com.ddanilov.new2025.challange150

fun main() {
    val nums = intArrayOf(4, 1, -1, 2, -1, 2, 3)
    val k = 2

    val result = topKFrequent(nums, k)

    result.forEach {
        println(it)
    }

}

/**
 * [
 * 0    1      2     3   4    5   6   7
 * [] [4,3] [2, -1] [ ]  []  []  []  []
 * ]
 */
private fun topKFrequent(nums: IntArray, k: Int): IntArray {
    val map = mutableMapOf<Int, Int>()
    val frequency = MutableList<MutableList<Int>>(size = nums.size + 1) { mutableListOf() }

    for (num in nums) {
        map[num] = 1 + map.getOrDefault(num, 0)
    }

    map.forEach { (n, c) ->
        frequency[c].add(n)
    }
    val result = mutableListOf<Int>()
    for (f in frequency.size - 1 downTo 0) {
        frequency[f].forEach {
            if (result.size < k) {
                result.add(it)
            } else {
                return@forEach
            }
        }
    }

    return result.toIntArray()
}

/**
 * 1, 1, 1, 2, 2, 3
 * i
 *       j
 * [
 * 1 : 3
 * 2   2
 * 3: 1
 *
 * ]
 */
private fun topKFrequentBrut1(nums: IntArray, k: Int): IntArray {
    val map = mutableMapOf<Int, Int>()
    for (i in nums) {
        map[i] = map.getOrDefault(i, 0) + 1
    }

    val sortedMap = map.entries
        .sortedByDescending { it.value }
        .associate { it.toPair() }

    val result = mutableListOf<Int>()

    sortedMap.forEach { (key, v) ->
        if (result.size < k) {
            result.add(key)
        } else {
            return@forEach
        }
    }

    return result.toIntArray()
}

