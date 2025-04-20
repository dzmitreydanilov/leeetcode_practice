package com.ddanilov.new2025

import java.util.Stack

fun main() {

    val nums1 = intArrayOf(4, 1, 2)
    val nums2 = intArrayOf(2,1,3,4)

    val result = nextGreaterElement(nums1, nums2)

    result.forEach {
        println(it)
    }

}

/**
 * 4, 1, 2
 *
 * 2,1,3,4
 *
 * cur = 3
 *
 * stack = [4]
 *
 * result = [-1, 3, 3]
 */
private fun nextGreaterElement(nums1: IntArray, nums2: IntArray): IntArray {
    val mapIds = mutableMapOf<Int, Int>()

    nums1.forEachIndexed { index, i ->
        mapIds[i] = index
    }

    val result = IntArray(nums1.size) { -1 }
    val stack = Stack<Int>()


    for (num in nums2) {
        val current = num

        while (stack.isNotEmpty() && current > stack.lastElement()) {
            val value = stack.pop()
            val index = mapIds[value]!!
            result[index] = current
        }

        if (current in mapIds) {
            stack.push(current)
        }
    }

    return result
}
