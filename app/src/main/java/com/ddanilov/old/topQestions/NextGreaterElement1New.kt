package com.ddanilov.topQestions

import java.util.Stack

fun main() {
    val nums1 = intArrayOf(4, 1, 2)
    val nums2 = intArrayOf(1, 3, 4, 2)

    println(nextGreaterElement(nums1, nums2).joinToString(" "))
}

// SC O(n)
// TC O(n)
private fun nextGreaterElement(nums1: IntArray, nums2: IntArray): IntArray {
    val stack = Stack<Int>()
    val greatestMap = mutableMapOf<Int, Int>()

    for (num in nums2) {
        while (stack.isNotEmpty() && stack.peek() < num) {
            greatestMap[stack.pop()] = num
        }

        stack.push(num)
        // [4]
        // [1 : 3]  [3 : 4]
    }

    for (i in nums1.indices) {
        nums1[i] = greatestMap.getOrDefault(nums1[i], -1)
    }

    return nums1
}
