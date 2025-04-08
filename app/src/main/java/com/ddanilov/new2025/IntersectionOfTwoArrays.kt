package com.ddanilov.new2025

fun main() {

    val nums1 = intArrayOf(1, 2, 2, 1)
    val nums2 = intArrayOf(2, 2)

    val result = intersection(nums1, nums2)

    result.forEach {
        print("$it, ")
    }

}

/**
 * 1, 2, 2, 1
 *
 * 2, 2
 *
 */

private fun intersectionBrut(nums1: IntArray, nums2: IntArray): IntArray {
    val finalSet = mutableSetOf<Int>()

    for (i in nums1) {
        for (j in nums2) {
            if (i == j) {
                finalSet.add(j)
            }
        }
    }

    return finalSet.toIntArray()
}

/**
 * 1, 2, 2, 1
 *
 * 1
 *
 *
 * 2, 2
 *
 * [2, ]
 *
 */
private fun intersection(nums1: IntArray, nums2: IntArray): IntArray {
    val set = mutableSetOf<Int>()
    val result = mutableListOf<Int>()

    nums1.forEach {
        set.add(it)
    }

    nums2.forEach {
        if (set.contains(it)) {
            result.add(it)
            set.remove(it)
        }
    }

    return result.toIntArray()
}
