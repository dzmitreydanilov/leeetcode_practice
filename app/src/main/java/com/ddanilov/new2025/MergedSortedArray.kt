package com.ddanilov.new2025

fun main() {

    val nums1 = intArrayOf(1, 2, 3, 0, 0, 0)
    val nums2 = intArrayOf(2, 5, 6)

    merge(nums1, 3, nums2, 3)

}

/**
 * 1, 2, 2, 3, 5, 6
 * p1 l
 * 2, x, x
 * p2
 */

fun merge(nums1: IntArray, m: Int, nums2: IntArray, n: Int): Unit {
    var i = m - 1
    var j = n - 1
    var last = m + n - 1
    while (j >= 0) {
        nums1[last--] = if (i < 0 || nums2[j] > nums1[i]) {
            nums2[j--]
        } else {
            nums1[i--]
        }
    }
}
