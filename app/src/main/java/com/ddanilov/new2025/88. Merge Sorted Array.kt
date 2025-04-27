package com.ddanilov.new2025

fun main() {
    val nums1 = intArrayOf(0)
    val m = 0
    val nums2 = intArrayOf(1)
    val n = 1

    merge(nums1, m, nums2, n)
}

/**
 * 0
 * l
 * m
 * 1
 * n
 */
private fun merge(nums1: IntArray, m: Int, nums2: IntArray, n: Int): Unit {
    var l = m + n - 1
    var i = m - 1
    var j = n - 1

    while (j >= 0) {
        if (i < 0 || nums2[j] > nums1[i]) {
            nums1[l] = nums2[j]
            j--
        } else if (nums1[i] >= nums2[j]) {
            nums1[l] = nums1[i]
            i--
        }
        l--
    }


    nums1.forEach {
        print(it)
    }
}
