package com.ddanilov.topQestions

fun main() {
    val nums = intArrayOf(1, 2, 3, 1, 1, 3)

    println(numIdenticalPairs(nums))
}

private fun numIdenticalPairs(nums: IntArray): Int {
    val pairMap = HashMap<Int, Int>()
    var pairCount = 0

    for (i in nums.indices) {
        if (pairMap.contains(nums[i])) {
            pairCount += pairMap[nums[i]]!!
        }

        pairMap[nums[i]] = pairMap.getOrDefault(nums[i], 0) + 1
    }
    // [1 : 1, 2 : 1, 3 : 1
    // answer = 1 + 2 + 1
    return pairCount
}

private fun numIdenticalPairsBucketSort(nums: IntArray): Int {
    val bucket = IntArray(101)
    var pairCount = 0

    for (num in nums) {
        bucket[num]++
    }

    for (num in bucket) {
        pairCount += (num * (num - 1)) / 2
    }

    return pairCount
}
