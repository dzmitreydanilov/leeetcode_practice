package com.ddanilov.topQestions

fun main() {
    val nums = intArrayOf(8, 1, 2, 2, 3)
    println(smallerNumbersThanCurrent(nums).joinToString(" "))
}

private fun smallerNumbersThanCurrent(nums: IntArray): IntArray {
    val bucket = IntArray(101)

    for (num in nums) {
        bucket[num]++
    }
    println(bucket.joinToString(" "))
    for (i in 1 until bucket.size) {
        bucket[i] += bucket[i - 1]
    }

    println(bucket.joinToString(" "))
    val answer = IntArray(nums.size)

    for (i in nums.indices) {
        if (nums[i] == 0) {
            answer[i] = 0
        } else {
            // 3
            answer[i] = bucket[nums[i] - 1]
        }
    }

    return answer
}
