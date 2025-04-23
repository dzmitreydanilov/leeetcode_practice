package com.ddanilov.new2025.first_iteration

fun main() {
    val nums1 = intArrayOf(1, 2, 2, 1)
    val nums2 = intArrayOf(2, 2)

    val result = intersect(nums1, nums2)

    result.forEach {
        println("$it, ")
    }
}

/**
 * 4,5,9
 *       l
 *
 * 4,4,8,9,9
 *         r
 *
 *
 * res = [4, 9]
 *
 */
private fun intersect(nums1: IntArray, nums2: IntArray): IntArray {
    var i = 0
    var j = 0
    var k = 0

    nums1.sort()
    nums2.sort()

    while (i < nums1.size && j < nums2.size) {
        if (nums1[i] == nums2[j]) {
            nums1[k] = nums1[i]
            i++
            j++
            k++
        } else if (nums1[i] > nums2[j]) {
            j++
        } else {
            i++
        }
    }

    return nums1.copyOfRange(0, k)
}
