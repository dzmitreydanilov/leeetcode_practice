package com.ddanilov.new2025

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
 *  1,3,5,2,4
 *
 *  6,5,4,3,2,1,7
 *
 *  [5, 4, 3, 2, 1, ]
 *
 *  -1, 3, -1
 */
private fun nextGreaterElement(nums1: IntArray, nums2: IntArray): IntArray {
    val mapId = mutableMapOf<Int, Int>()

    nums1.forEachIndexed { i, v ->
        mapId[v] = i
    }

    val stack = Stack<Int>()
    val result = IntArray(nums1.size) { -1 }

    for (num in nums2) {
        val current = num
        while (stack.isNotEmpty() && current > stack.peek()) {
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

