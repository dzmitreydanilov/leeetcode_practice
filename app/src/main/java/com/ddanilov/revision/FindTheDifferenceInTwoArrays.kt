package com.ddanilov.revision

fun main() {
    val nums1 = intArrayOf(1, 2, 3, 3)
    val nums2 = intArrayOf(1, 1, 2, 2)
    val result = findDifference1(nums1, nums2)

    println(result.joinToString(""))
}

// SC O(N)
// TC O(N)
private fun findDifference(nums1: IntArray, nums2: IntArray): List<List<Int>> {
    val res1 = mutableListOf<Int>()
    val res2 = mutableListOf<Int>()

    for (i in nums1.indices) {
        if (!nums2.contains(nums1[i])) {
            if (!res1.contains(nums1[i])) {
                res1.add(nums1[i])
            }
        }
    }

    for (i in nums2.indices) {
        if (!nums1.contains(nums2[i])) {
            if (!res2.contains(nums2[i])) {
                res2.add(nums2[i])
            }
        }
    }

    return listOf(res1, res2)
}

// SC O(N)
// TC O(N)
private fun findDifference1(nums1: IntArray, nums2: IntArray): List<List<Int>> {
    val nums1Set = nums1.toSet()
    val nums2Set = nums2.toSet()
    val res1 = mutableSetOf<Int>()
    val res2 = mutableSetOf<Int>()

    for (i in nums1.indices) {
        if (!nums2Set.contains(nums1[i])) res1.add(nums1[i])
    }

    for (i in nums2.indices) {
        if (!nums1Set.contains(nums2[i])) res2.add(nums2[i])
    }

    return listOf(res1.toList(), res2.toList())
}

