package com.ddanilov.topQestions

fun main() {
    val nums1 = intArrayOf(1, 2, 2, 1)
    val nums2 = intArrayOf(2, 2)
    println(intersection(nums1, nums2).joinToString(" "))
}

private fun intersection(nums1: IntArray, nums2: IntArray): IntArray {
    val set = nums1.toSet()
    val answer = mutableListOf<Int>()

    nums2.forEach {
        if(set.contains(it)) {
            answer.add(it)
        }
    }

    return answer.toIntArray()
}
