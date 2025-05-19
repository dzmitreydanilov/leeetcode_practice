package com.ddanilov.new2025

import java.util.Arrays

fun main() {
    val nums1 = intArrayOf(1, 2, 2, 1)
    val nums2 = intArrayOf(2, 2)

    val result = intersect(nums1, nums2)

    result.forEach {
        println(it)
    }
}

/**
 * 1, 2, 2, 1
 *    i
 * 2, 2
 *    p
 *
 * 1, 1, 2, 2
 *          i
 * 2, 2
 *    j
 *
 * 1, 1, 2, 4, 4, 9
 *    i
 *
 * 1, 2, 4, 4, 8
 * j
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
        when {
            nums1[i] < nums2[j] -> {
                i++
            }

            nums2[j] < nums1[i] -> {
                j++
            }

            else -> {
                nums1[k] = nums1[i]
                k++
                i++
                j++
            }
        }
    }

    return nums1.copyOfRange(0, k)
}
