package com.ddanilov.revision

fun main() {
    val nums = intArrayOf(1, 1, 1)
    val k = 2
    val result = subarraySum(nums, k)

    println(result)
}

//intArrayOf(1, 1, 1)
// SC O(n^2)
private fun subarraySum(nums: IntArray, k: Int): Int {
    var result = 0
    for (i in nums.indices) {
        var currentSum = 0
        for (j in i until nums.size) {
            currentSum += nums[j]
            if (currentSum != k) continue
            else result++
        }
    }

    return result
}


private fun subarraySum1(nums: IntArray, k: Int): Int {
    var result = 0
    var currentSum = 0
    val occurrenceMap = HashMap<Int, Int>()
    occurrenceMap[0] = 1

    for (i in nums.indices) {
        currentSum += nums[i]
        if (occurrenceMap.contains(currentSum - k)) {
            result += occurrenceMap[currentSum - k]!!
        }
        occurrenceMap[currentSum] = occurrenceMap.getOrDefault(currentSum, 0) + 1
    }

    return result
}
