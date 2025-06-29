package com.ddanilov.newchallange

fun main() {
    val nums = intArrayOf(2, 3, 4, 5)
    val result = productExceptSelf(nums)

    result.forEach {
        println(it)
    }
}

/**
 * 1, 2, 3, 4
 * i
 * 1, 1, 1, 1
 *
 * prefix = 1
 *
 *          1, 2, 3, 4
 *          i
 *
 * answer: 24, 12, 8, 4
 *
 *
 * postfix = 24
 */
private fun productExceptSelf(nums: IntArray): IntArray {

    val answer = IntArray(nums.size) { 1 }

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

/**
 * 4, 6, 3, 4
 *
 * 1, 4, 24, 72
 *
 *            i
 *
 * 4, 6, 3, 4
 * 72, 12, 4, 1
 *
 *
 * 72, 12, 4, 1
 * 1, 4, 24, 72
 * i
 */
private fun productExceptSelf2(nums: IntArray): IntArray {

    val prefix = MutableList<Int>(size = nums.size) { 1 }
    val postfix = MutableList<Int>(size = nums.size) { 1 }

    for (i in 1 until prefix.size) {
        prefix[i] = prefix[i - 1] * nums[i - 1]
    }


    for (i in nums.size - 2 downTo 0) {
        postfix[i] = postfix[i + 1] * nums[i + 1]
    }

    val answer = IntArray(nums.size)

    for (i in answer.indices) {
        answer[i] = postfix[i] * prefix[i]
    }

    return answer
}