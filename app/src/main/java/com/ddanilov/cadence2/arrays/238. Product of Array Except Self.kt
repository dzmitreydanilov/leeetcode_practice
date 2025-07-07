package com.ddanilov.cadence2.arrays

fun main() {
    val nums = intArrayOf(1, 2, 3, 4)

    val result = productExceptSelf(nums)

    result.forEach {
        println(it)
    }
}

/**
 * 1, 2, 3,4
 * i
 *
 * [1,1,2,6]
 * [24,12,4,1]
 *
 * [24,12,8,6]
 *        i
 */
private fun productExceptSelf(nums: IntArray): IntArray {
    val prefix = IntArray(nums.size) { 1 }
    val postfix = IntArray(nums.size) { 1 }

    for (i in 1..nums.lastIndex) {
        prefix[i] = nums[i - 1] * prefix[i - 1]
    }

    for (i in nums.lastIndex - 1 downTo 0) {
        postfix[i] = nums[i + 1] * postfix[i + 1]
    }

    val answer = IntArray(nums.size)

    for (i in nums.indices) {
        answer[i] = prefix[i] * postfix[i]
    }

    return answer
}

/**
 *  -1, 1, 0, -3, 3
 *                i
 *  prefix = 0
 *  prefix *= nums[i]
 *  [1,-1,-1,0,0]
 *
 *  postfix = 0
 *  answer[i] *= postfix
 *  postfix *= nums[i]
 *  [0,0,9,0,0]
 *
 */
private fun productExceptSelf2(nums: IntArray): IntArray {
        val answer = IntArray(nums.size)

        var prefix = 1
        for (i in nums.indices) {
            answer[i] = prefix
            prefix *= nums[i]
        }

        var postfix = 1
        for (i in nums.lastIndex downTo 0) {
            answer[i] *= postfix
            postfix *= nums[i]
        }

        return answer
}