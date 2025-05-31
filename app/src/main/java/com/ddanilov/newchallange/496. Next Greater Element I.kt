package com.ddanilov.newchallange

import java.util.Stack

fun main() {
    val nums1 = intArrayOf(4, 1, 2)
    val nums2 = intArrayOf(1, 3, 4, 2)

    val result = nextGreaterElement(nums1, nums2)

    result.forEach {
        println(it)
    }
}

/***
 * 1, 3, 4, 2
 *
 * 4, 1, 2
 *
 * -1, 3, -1
 *
 * [4,2]
 */
private fun nextGreaterElement(nums1: IntArray, nums2: IntArray): IntArray {
    val result = IntArray(nums1.size) { -1 }
    val stack = Stack<Int>()
    val indexMap = mutableMapOf<Int, Int>()
    nums1.forEachIndexed { i, v ->
        indexMap[v] = i
    }

    for (i in nums2.indices) {
        val current = nums2[i]

        while (stack.isNotEmpty() && current > stack.peek()) {
            val value = stack.pop()
            val index = indexMap[value]!!
            result[index] = current
        }

        if (indexMap.contains(current)) {
            stack.push(current)
        }
    }

    return result
}
