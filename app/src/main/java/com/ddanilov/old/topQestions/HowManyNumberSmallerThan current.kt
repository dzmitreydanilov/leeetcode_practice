package com.ddanilov.topQestions

fun main() {
    val nums = intArrayOf(8, 1, 2, 2, 3)

    println(smallerNumbersThanCurrent1(nums).joinToString(" "))
}

// TC O(n^2)
// SC O(n)
private fun smallerNumbersThanCurrent(nums: IntArray): IntArray {
    val answer = IntArray(nums.size)

    for (i in nums.indices) {
        var counter = 0
        for (element in nums) {
            if (nums[i] > element) {
                counter++
            }
        }
        answer[i] = counter
    }
    return answer
}

//val nums = intArrayOf(8, 1, 2, 2, 3)
// TC O(n)
// SC O(n)
private fun smallerNumbersThanCurrent1(nums: IntArray): IntArray {
    val bucket = IntArray(100)

    for (num in nums) {
        bucket[num]++
    }

    for (i in 1 until bucket.size) {
        bucket[i] += bucket[i - 1]
    }
    val answer = IntArray(nums.size)

    for (i in nums.indices) {
        if (nums[i] == 0) {
            answer[i] = 0
        } else {
            answer[i] = bucket[nums[i] - 1]
        }
    }

    return answer
}
