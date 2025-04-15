package com.ddanilov.new2025

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
 * 2, 1, 3, 4
 *
 * cur = 4
 *
 * stack = [4]
 *
 * result = [-1, 1, 2]
 */

private fun nextGreaterElementBrut(nums1: IntArray, nums2: IntArray): IntArray {
    for (i in nums1.indices) {
        val itemIndex = nums2.indexOf(nums1[i])
        if (itemIndex != -1 && itemIndex + 1 < nums2.size) {
            var startPosition = itemIndex + 1
            while (startPosition <= nums2.lastIndex) {
                if (nums2[startPosition] > nums1[i]) {
                    nums1.set(i, nums2[startPosition])
                    break
                } else if (startPosition == nums2.lastIndex) {
                    nums1.set(i, -1)
                    break
                }
                startPosition++
            }
        } else {
            nums1.set(i, -1)
        }
    }
    return nums1
}

private fun nextGreaterElement(nums1: IntArray, nums2: IntArray): IntArray {
    val mapIdx = mutableMapOf<Int, Int>()
    nums1.forEachIndexed { index, i ->
        mapIdx[i] = index
    }

    val stack = ArrayDeque<Int>()
    val result = IntArray(nums1.size) { -1 }

    for (num in nums2) {
        val current = num
        while (stack.isNotEmpty() && current > stack.last()) {
            val key = stack.removeLast()
            val index = mapIdx[key]!!
            result[index] = current
        }

        if (current in mapIdx) {
            stack.add(current)
        }
    }
    return result
}
