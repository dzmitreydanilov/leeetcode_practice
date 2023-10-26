package com.ddanilov.topQestions

fun main() {
    val nums1 = intArrayOf(1, 2, 2, 1)
    val nums2 = intArrayOf(2, 2)

    println(intersection(nums1, nums2).joinToString(" "))
}

private fun intersection(nums1: IntArray, nums2: IntArray): IntArray {
    val answer = mutableSetOf<Int>()
    val set1 = nums1.toHashSet()

    nums2.forEach {
        if (set1.contains(it)) {
            answer.add(it)
        }
    }

    return answer.toIntArray()
}


