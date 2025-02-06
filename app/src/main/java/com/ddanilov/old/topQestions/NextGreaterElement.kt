package com.ddanilov.topQestions

import java.util.Stack

fun main() {
    val nums1 = intArrayOf(4, 1, 2)
    val nums2 = intArrayOf(1, 3, 4, 2)

    println(nextGreaterElement(nums1, nums2).joinToString(" "))
}

private fun nextGreaterElement(nums1: IntArray, nums2: IntArray): IntArray {
    val nextGreatestMap = HashMap<Int, Int>()
    val stack = Stack<Int>()

    for (num in nums2) {
        if(stack.isNotEmpty() && stack.peek() < num) {
            nextGreatestMap[stack.pop()] = num
        }

        stack.push(num)
    }

    for(i in nums1.indices) {
        nums1[i] = nextGreatestMap.getOrDefault(nums1[i], -1)
    }

    return nums1
}



