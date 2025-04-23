package com.ddanilov.new2025.first_iteration

import java.util.Stack

fun main() {

    val nums1 = intArrayOf(4, 1, 2)
    val nums2 = intArrayOf(1, 3, 4, 2)

    val result = nextGreaterElement(nums1, nums2)


    result.forEach {
        println(it)
    }
}

/**
 * 4, 1, 2
 *
 * 1, 3, 4, 2
 *
 * result = [-1,3,-1]
 *stack = [1,]
 */

private fun nextGreaterElement(nums1: IntArray, nums2: IntArray): IntArray {
    val mapId = mutableMapOf<Int, Int>()

    nums1.forEachIndexed { index, i ->
        mapId[i] = index
    }

    val stack = Stack<Int>()
    val result = IntArray(nums1.size) { -1 }


    for (num in nums2) {
        val current = num
        while (stack.isNotEmpty() && current > stack.lastElement()) {
            val value = stack.pop()
            val index = mapId[value]!!
            result[index] = current
        }

        if (num in mapId) {
            stack.push(num)
        }
    }

    return result
}
