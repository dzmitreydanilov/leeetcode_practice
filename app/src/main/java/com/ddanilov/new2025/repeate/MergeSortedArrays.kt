package com.ddanilov.new2025.repeate

fun main() {
    val nums1 = intArrayOf(0)
    val m = 1
    val nums2 = intArrayOf()

    val n = 0

    merge(nums1, m, nums2, n)
}

/**
 * 0
 * l
 * p1
 * 1
 * p2
 *
 */

private fun merge(nums1: IntArray, m: Int, nums2: IntArray, n: Int): Unit {
    var p1 = m - 1
    var p2 = n - 1

    var insertIndex = (m + n) - 1
    while (p2 >= 0) {
        nums1[insertIndex--] = if (p1 < 0 || nums2[p2] > nums1[p1]) {
            nums2[p2--]
        } else {
            nums1[p1--]
        }
    }

    nums1.forEach {
        print("$it, ")
    }
}