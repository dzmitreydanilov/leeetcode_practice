package com.ddanilov.newchallange

import java.util.Arrays

fun main() {
    val nums1 = intArrayOf(4, 9, 5)
    val nums2 = intArrayOf(9, 4, 9, 8, 4)

    val result = intersect(nums1, nums2)

    result.forEach {
        println(it)
    }
}


/**
 * 1, 1, 2, 2
 *          i
 *
 * 2, 2
 *    j
 *
 * [1,2,2,]
 *
 *
 */
private fun intersect(nums1: IntArray, nums2: IntArray): IntArray {
    Arrays.sort(nums1)
    Arrays.sort(nums2)

    var i = 0
    var j = 0
    var k = 0

    while (i < nums1.size && j < nums2.size) {
        if (nums2[j] > nums1[i]) {
            i++
        } else if (nums1[i] > nums2[j]) {
            j++
        } else {
            nums1[k++] = nums1[i]
            i++
            j++
        }
    }

    return nums1.copyOfRange(0, k)
}