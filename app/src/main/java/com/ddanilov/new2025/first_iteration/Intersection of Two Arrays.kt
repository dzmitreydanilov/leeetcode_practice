package com.ddanilov.new2025.first_iteration

fun main() {
    val nums1 = intArrayOf(1, 2, 2, 1)
    val nums2 = intArrayOf(2, 2)

    val result = intersection(nums1, nums2)

    result.forEach {
        println("$it, ")
    }

}

/**
 * 1, 2, 2, 1
 * 2, 2
 *
 * 1
 *
 * res = [2]
 */

private fun intersection(nums1: IntArray, nums2: IntArray): IntArray {

    val set = mutableSetOf<Int>()

    nums1.forEach {
        set.add(it)
    }

    val result = mutableListOf<Int>()

    nums2.forEach {
        if (set.contains(it)) {
            set.remove(it)
            result.add(it)
        }
    }

    return result.toIntArray()
}