package com.ddanilov.topQestions

import java.util.Arrays

fun main() {
    val nums1 = intArrayOf(5, 9, 6)
    val nums2 = intArrayOf(9, 4, 9, 8, 4)

    println(intersection(nums1, nums2).joinToString(" "))
}

private fun intersection(nums1: IntArray, nums2: IntArray): IntArray {
    var i = 0
    var j = 0
    var result = mutableListOf<Int>()

    Arrays.sort(nums1)
    Arrays.sort(nums2)
    //5, 6, 9
    //4, 4, 8, 9, 9
    while (i < nums1.size && j < nums2.size) {
        if (nums1[i] < nums2[j]) {
            i++
        } else if (nums1[i] > nums2[j]) {
            j++
        } else {
            result.add(nums1[i])
            i++
            j++
        }
    }

    return result.toIntArray()
}


