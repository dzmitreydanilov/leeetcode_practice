package com.ddanilov.cadence2.arrays

fun main() {
    val nums1 = intArrayOf(1, 2, 2, 1)
    val nums2 = intArrayOf(2, 2)

    val result = intersection(nums1, nums2)

    result.forEach {
        println(it)
    }
}

/**
 * 2, 2
 *
 * [1]
 *
 *
 * {2}
 */
private fun intersection(nums1: IntArray, nums2: IntArray): IntArray {
        val set = nums1.toMutableSet()

        val answer = mutableListOf<Int>()

        nums2.forEach {
            if (set.contains(it)) {
                answer.add(it)
                set.remove(it)
            }
        }

        return answer.toIntArray()
}