package com.ddanilov.new2025

fun main() {
    val nums1 = intArrayOf(1, 2, 2, 1)
    val nums2 = intArrayOf(2, 2)

    val result = intersection(nums1, nums2)

    result.forEach {
        println("$it, ")
    }
}

/**
 * 4,9,5
 *
 * 9,4,9,8,4
 *
 *  5
 *
 *
 * res = [9, 4, ]
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
