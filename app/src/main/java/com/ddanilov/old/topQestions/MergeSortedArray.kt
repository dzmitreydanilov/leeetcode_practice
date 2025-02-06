package com.ddanilov.topQestions

fun main() {
    val nums1 = intArrayOf(1, 2, 3, 0, 0, 0)
    val nums2 = intArrayOf(2, 5, 6)
    //3
    val m = 3
    //3
    val n = 3


}

private fun merge(nums1: IntArray, m: Int, nums2: IntArray, n: Int): Unit {
    var insertIndex = n + m - 1
    var l = m
    var r = n

    while (l > 0 && r > 0) {
        if (nums1[l - 1] > nums2[r - 1]) {
            nums1[insertIndex] = nums1[l - 1]
            l--
        } else {
            nums1[insertIndex] = nums2[r - 1]
            r--
        }

        insertIndex--
    }

    while (r > 0) {
        nums1[insertIndex] = nums2[r - 1]
        r--
        insertIndex--
    }
}
