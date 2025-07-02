package com.ddanilov.cadence2.arrays

import java.util.Stack

fun main() {
    val nums1 = intArrayOf(1, 3, 5, 2, 4)
    val nums2 = intArrayOf(6, 5, 4, 3, 2, 1, 7)

    val result = nextGreaterElement(nums1, nums2)

    result.forEach {
        println(it)
    }

}

/**
 * 6, 5, 4, 3, 2, 1, 7
 *
 * 1, 3, 5, 2, 4
 *
 * [5,4,3,2,1,]
 *
 * [        ]
 *
 */
private fun nextGreaterElement(nums1: IntArray, nums2: IntArray): IntArray {
    val answer = IntArray(nums1.size) { -1 }
    val stack = Stack<Int>()
    val mappingMap = mutableMapOf<Int, Int>()

    nums1.forEachIndexed { index, v ->
        mappingMap[v] = index
    }

    for (num in nums2) {
        while (stack.isNotEmpty() && num > stack.peek()) {
            val value = stack.pop()
            val insertIndex = mappingMap[value]!!
            answer[insertIndex] = num
        }

        if (mappingMap.contains(num)) {
            stack.add(num)
        }
    }

    return answer
}
