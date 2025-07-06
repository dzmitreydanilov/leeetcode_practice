package com.ddanilov.cadence2.arrays

import java.util.Arrays
import java.util.Collections
import java.util.PriorityQueue

fun main() {
    val nums = intArrayOf(3, 2, 1, 5, 6, 4)
    val k = 2

    val result = findKthLargest(nums, k)

    println(result)
}

/**
 *
 * 3, 2, 1, 5, 6, 4
 * 1,2,3,4,5,6
 */
private fun findKthLargest(nums: IntArray, k: Int): Int {
    val maxHeap = PriorityQueue<Int>(Collections.reverseOrder())
    maxHeap.addAll(nums.asList())

    var answer = 0
    var counter = k

    while (counter > 0) {
        answer = maxHeap.poll()!!
        counter--
    }

    return answer
}