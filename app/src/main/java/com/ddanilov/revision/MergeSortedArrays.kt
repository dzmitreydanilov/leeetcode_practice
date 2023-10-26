package com.ddanilov.revision

fun main() {
    val nums1 = intArrayOf(1, 2, 3, 0, 0, 0)
    val nums2 = intArrayOf(2, 5, 6)
    val n = 3
    val m = 3
    val result = merge(nums1, m, nums2, n)
}

private fun merge(nums1: IntArray, m: Int, nums2: IntArray, n: Int): Unit {
    // define last index
    var last = n + m - 1
    // define pointer in the nums1
    var pointer1 = n
    // define pointer in the nums2
    var pointer2 = m
    // iterate using pointers
    while (pointer1 > 0 && pointer2 > 0) {
        if (nums1[pointer1 - 1] > nums2[pointer2 - 1]) {
            nums1[last] = nums1[pointer1 - 1]
            pointer1--
        } else {
            nums1[last] = nums2[pointer2 - 1]
            pointer2--
        }
        last--
    }

    // put last indexes from the nums 2 to the start of the nums1
    while (pointer2 > 0) {
        nums1[last] = nums2[pointer2 - 1]
        pointer2--
        last--
    }


    println(nums1.joinToString(" "))
}
