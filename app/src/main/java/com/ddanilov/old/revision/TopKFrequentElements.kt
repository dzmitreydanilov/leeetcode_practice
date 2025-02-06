package com.ddanilov.revision

fun main() {
    val nums = intArrayOf(1, 1, 1, 2, 2, 3)
    val k = 2
    val result = topKFrequent(nums, k)
    println(result.joinToString(""))
}


private fun topKFrequent(nums: IntArray, k: Int): IntArray {
    val resultArray = mutableListOf<Int>()
    val numsCountMap = HashMap<Int, Int>()
    val frequencyRangeArray = MutableList<MutableList<Int>>(nums.size + 1) {
        mutableListOf()
    }

    nums.forEach {
        numsCountMap[it] = numsCountMap.getOrDefault(it, 0) + 1
    }

    for ((n, c) in numsCountMap) {
        frequencyRangeArray[c].add(n)
    }

    for (i in frequencyRangeArray.lastIndex downTo 0) {
        for (n in frequencyRangeArray[i]) {
            resultArray.add(n)
            if (resultArray.size == k) {
                return resultArray.toIntArray()
            }
        }
    }
    return intArrayOf()
}

