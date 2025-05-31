package com.ddanilov.newchallange

fun main() {
    val nums1 = intArrayOf(1, 2, 2, 1)
    val nums2 = intArrayOf(2, 2)

    val result = intersection(nums1, nums2)

    result.forEach {
        println(it)
    }
}

/**
 * 1, 2, 2, 1
 *
 * 2,2
 *
 * 1
 *
 * 2,2
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
            set.remove(it)
            result.add(it)
        }
    }

    return result.toIntArray()
}