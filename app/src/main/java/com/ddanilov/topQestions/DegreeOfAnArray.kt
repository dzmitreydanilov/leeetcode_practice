package com.ddanilov.topQestions

fun main() {
    val nums = intArrayOf(1, 2, 2, 3, 1)

    println(findShortestSubArray(nums))
}

private fun findShortestSubArray(nums: IntArray): Int {
    val numsCount = HashMap<Int, Int>()
    var degree = 0
    val firstSeen = HashMap<Int, Int>()
    var minLength = 0

    for (i in nums.indices) {
        firstSeen.putIfAbsent(nums[i], i)
        numsCount[nums[i]] = numsCount.getOrDefault(nums[i], 0) + 1

        if (numsCount[nums[i]]!! > degree) {
            degree = numsCount[nums[i]]!!
            minLength = i - firstSeen[nums[i]]!! + 1
        } else if (numsCount[nums[i]]!! == degree) {
            minLength = minOf(minLength, i - firstSeen[nums[i]]!! + 1)
        }
    }

    return minLength
}
// fs = [1:0, 2:2,
// numCount = [1:1, 2:2
//degree = 2
//minL = 2 - 1 + 1
