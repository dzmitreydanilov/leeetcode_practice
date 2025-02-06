package com.ddanilov.topQestions

import kotlin.math.min

fun main() {
    val nums = intArrayOf(1, 2, 2, 3, 1)
    println(findShortestSubArray(nums))
}

private fun findShortestSubArray(nums: IntArray): Int {
    val numsCountMap = HashMap<Int, Int>()
    val firstSeen = HashMap<Int, Int>()
    var degree = 0
    var minLength = 0

    for (i in nums.indices) {
        firstSeen.putIfAbsent(nums[i], i)
        numsCountMap.put(nums[i], numsCountMap.getOrDefault(nums[i], 0) + 1)

        if (numsCountMap[nums[i]]!! > degree) {
            degree = numsCountMap[nums[i]]!!
            minLength = i - firstSeen[nums[i]]!! + 1
        } else if (numsCountMap[nums[i]] == degree) {
            minLength = minOf(minLength, i - firstSeen[nums[i]]!! + 1)
        }
    }

    return minLength
}
