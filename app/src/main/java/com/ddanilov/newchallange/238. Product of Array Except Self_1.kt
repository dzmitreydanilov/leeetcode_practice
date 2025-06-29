package com.ddanilov.newchallange

fun main() {

    val nums = intArrayOf(1, 2, 3, 4)

    val result = productExceptSelf1(nums)

    result.forEach {
        println(it)
    }
}

/**
 * 1, 2, 3, 4
 *
 *
 * postifx = 24
 * answer = [1, 12, 8, 6]
 *
 *
 *
 */
private fun productExceptSelf(nums: IntArray): IntArray {
    val answer = MutableList<Int>(size = nums.size) { 1 }

    var prefix = 1

    for (i in answer.indices) {
        answer[i] = prefix
        prefix *= nums[i]
    }

    var postfix = 1
    for (i in answer.lastIndex downTo 0) {
        answer[i] *= postfix
        postfix *= nums[i]
    }

    return answer.toIntArray()
}

private fun productExceptSelf1(nums: IntArray): IntArray {
    val prefix = MutableList<Int>(nums.size) { 1 }
    val postfix = MutableList<Int>(nums.size) { 1 }

    /**
     * 1,2,3,4
     *       i
     * 1,1,2,6
     *       i
     */

    for (i in 1 until nums.size) {
        prefix[i] = prefix[i - 1] * nums[i - 1]
    }

    /**
     * 1,2,3,4
     * i
     * 1,2,3,4
     * i
     */
    for (i in nums.size - 2 downTo 0) {
        postfix[i] = postfix[i + 1] * nums[i + 1]
    }

    /**
     * 1,2,3,1
     *
     * 1,2,3,4
     *
     *  1  4  9  4
     */
    val result = IntArray(nums.size)
    for (i in nums.indices) {
        result[i] = prefix[i] * postfix[i]
    }

    return result
}