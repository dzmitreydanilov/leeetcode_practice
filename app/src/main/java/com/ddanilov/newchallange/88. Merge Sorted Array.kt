package com.ddanilov.newchallange

fun main() {
    val nums1 = intArrayOf(0)
    val m = 0
    val nums2 = intArrayOf(1)
    val n = 1

    merge(nums1, m, nums2, n)
}

/**
 * 1, 2, 2, 3, 5, 6
 *  i
 *       k
 * 2, 5, 6
 * j
 *
 * 0
 *
 * 1
 *
 */
private fun merge(nums1: IntArray, m: Int, nums2: IntArray, n: Int): Unit {
    var k = m + n - 1
    var i = m - 1
    var j = n - 1
    while (j >= 0) {
        if (i < 0 || nums2[j] > nums1[i]) {
            nums1[k] = nums2[j]
            j--
            k--
        } else if (nums1[i] >= nums2[j]) {
            nums1[k] = nums1[i]
            i--
            k--
        }
    }

    nums1.forEach {
        println(it)
    }
}
