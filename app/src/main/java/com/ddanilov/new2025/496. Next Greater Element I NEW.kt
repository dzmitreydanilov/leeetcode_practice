package com.ddanilov.new2025

import java.util.Stack

fun main() {
    val nums2 = intArrayOf(1, 3, 4, 2)
    val nums1 = intArrayOf(4, 1, 2)

    val result = nextGreaterElement(nums1, nums2)

    result.forEach {
        println(it)
    }
}


/**
 *
 * 1, 3, 4, 2
 *
 * 4, 1, 2
 *
 * [1,]
 *
 */
private fun nextGreaterElement(nums1: IntArray, nums2: IntArray): IntArray {
    val result = IntArray(nums1.size) { -1 }
    val stack = Stack<Int>()
    val map = mutableMapOf<Int, Int>()
    for (i in nums1.indices) {
        map[nums1[i]] = i
    }

    for (num in nums2) {
        val current = num
        while (stack.isNotEmpty() && current > stack.peek()) {
            val value = stack.pop()
            val index = map[value]!!
            result[index] = current
        }

        if (num in map) {
            stack.push(num)
        }
    }

    return result
}