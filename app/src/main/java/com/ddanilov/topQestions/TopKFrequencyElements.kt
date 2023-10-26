package com.ddanilov.topQestions

fun main() {
    val nums = intArrayOf(1, 1, 1, 2, 2, 3)
    val k = 2

    println(topKFrequent(nums, k).joinToString(" "))
}


private fun topKFrequent(nums: IntArray, k: Int): IntArray {
    val result = mutableListOf<Int>()
    //key = num, value = count
    val numsCountMap = mutableMapOf<Int, Int>()
    val frequencyArray = MutableList<MutableList<Int>>(nums.size + 1) {
        mutableListOf()
    }

    nums.forEach { num ->
        numsCountMap[num] = numsCountMap.getOrDefault(num, 0) + 1
    }

    // Fill frequency array, where index it is count, and values it is array of values with the defined count
    for((num, count) in numsCountMap) {
        frequencyArray[count].add(num)
    }

    for(i in frequencyArray.lastIndex downTo  0) {
        for(j in frequencyArray[i]) {
            result.add(j)
            if(result.size == k) {
                return result.toIntArray()
            }
        }
    }

    return intArrayOf()
}
