package com.ddanilov.cadence2.arrays

fun main() {
    val nums1 = intArrayOf(0)
    val m = 0
    val nums2 = intArrayOf(1)
    val n = 1

    merge(nums1, m, nums2, n)
}

/**
 * 1, 2, 3, 0, 0, 0
 * m
 *                i
 * 2, 5, 6
 * n
 */
private fun merge(nums1: IntArray, m: Int, nums2: IntArray, n: Int): Unit {
    var i = m - 1
    var j = n - 1
    var k = m + n -1

    while (j >= 0) {
        if (i < 0 || nums1[i] < nums2[j]) {
            nums1[k] = nums2[j]
            j--
        } else {
            nums1[k] = nums1[i]
            i--
        }

        k--
    }

    nums1.forEach {
        println(it)
    }
}