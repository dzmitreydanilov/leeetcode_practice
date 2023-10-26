package com.ddanilov.revision

import java.util.Stack

fun main() {
    val nums1 = intArrayOf(3, 1, 5, 7, 9, 2, 6)
    val nums2 = intArrayOf(1, 2, 3, 5, 6, 7, 9, 11)
    val result = nextGreaterElement(nums1, nums2)

    println(result.joinToString(" "))
}

// TC O(n^2)
private fun nextGreaterElement(nums1: IntArray, nums2: IntArray): IntArray {
    for (i in nums1.indices) {
        val item = nums1[i]
        var foundElement = -1
        val indexOfItem = nums2.indexOf(item)
        for (j in indexOfItem until nums2.size) {
            if (nums2[j] > item) {
                foundElement = maxOf(nums2[j], foundElement)
                break
            }
        }
        nums1[i] = foundElement
    }
    return nums1
}

//val nums2 = intArrayOf(1, 2, 3, 6, 5, 7, 9, 11)
// TC O(n)
// SC O(n)
// stack [11]
// map [1 to 2, 2 to 3, 3 to 6, 5 to 7, 6 to 7, 7 to 9, 9 to 11]
private fun nextGreaterElement1(nums1: IntArray, nums2: IntArray): IntArray {
    val map = HashMap<Int, Int>()
    val stack = Stack<Int>()

    for (num in nums2) {
        if (!stack.isEmpty() && stack.peek() < num) {
            map[stack.pop()] = num
        }

        stack.push(num)
    }

    for (i in nums1.indices) {
        nums1[i] = map.getOrDefault(nums1[i], -1)
    }

    return nums1
}
