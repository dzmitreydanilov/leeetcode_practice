package com.ddanilov.new2025.repeate

fun main() {
    val nums1 = intArrayOf(0)
    val nums2 = intArrayOf(1)

    merge(nums1, 0, nums2, 0)
}

/**
 *  1, 2, 2, 3, 5, 6
 *  p1
 *  l
 *  2, 5, 6
 *  p2
 *
 * 1
 * p1
 * l
 * 1
 * p2
 *
 *
 */

private fun merge(nums1: IntArray, m: Int, nums2: IntArray, n: Int): Unit {
    var p1 = m - 1
    var p2 = n - 1

    var last = m + n - 1

    while (p2 >= 0) {
        nums1[last--] = if (p1 < 0 || nums2[p2] > nums1[p1]) {
            nums2[p2--]
        } else {
            nums1[p1--]
        }
    }

    nums1.forEach {
        println("XXX $it")
    }
}