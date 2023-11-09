package com.ddanilov.topQestions

fun main() {
    val nums1 = intArrayOf(1, 2, 2, 1)
    val nums2 = intArrayOf(2, 2)

    println(intersect(nums1, nums2).joinToString(" "))
}

private fun intersect(nums1: IntArray, nums2: IntArray): IntArray {
    val answer = mutableListOf<Int>()
    var i = 0
    var n = 0

    nums1.sort()
    nums2.sort()

    while (i < nums1.size && n < nums2.size) {
        if(nums1[i] < nums2[n]) {
            i++
        } else if(nums1[i] > nums2[n]) {
            n++
        } else {
            answer.add(nums1[i])
            i++
            n++
        }
    }

    return answer.toIntArray()
}
