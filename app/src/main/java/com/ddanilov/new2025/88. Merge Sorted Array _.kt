package com.ddanilov.new2025

fun main() {

    val nums1 = intArrayOf(1, 2, 3, 0, 0, 0)
    val m = 3
    val nums2 = intArrayOf(2, 5, 6)
    val n = 3

    merge(nums1, m, nums2, n)

}

/**
 *
 * 1, 2, 2, 3, 5, 6
i
 * p
 * 2, 5, 6
j
 *
 */

private fun merge(nums1: IntArray, m: Int, nums2: IntArray, n: Int): Unit {
    var p = m + n - 1
    var i = m - 1
    var j = n - 1

    while (j >= 0) {
        if (i < 0 || nums2[j] > nums1[i]) {
            nums1[p] = nums2[j]
            j--
        } else {
            nums1[p] = nums1[i]
            i--
        }
        p--
    }

    nums1.forEach {
        println(it)
    }
}