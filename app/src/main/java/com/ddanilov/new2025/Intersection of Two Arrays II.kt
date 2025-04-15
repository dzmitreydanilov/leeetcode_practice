package com.ddanilov.new2025

fun main() {
    val num1 = intArrayOf(4, 9, 5)
    val num2 = intArrayOf(9, 4, 9, 8, 4)

    val result = intersect(num1, num2)

    result.forEach {
        println("$it, ")
    }
}

/**
 * 1,2,2,1
 * 2,2
 *
 * 4,4,8,9,9
 *      i
 * 4,5,9
 *     j
 *
 * k
 */
private fun intersect(nums1: IntArray, nums2: IntArray): IntArray {
    var i = 0
    var j = 0
    var k = 0

    nums1.sort()
    nums2.sort()

    while (i < nums1.size && j < nums2.size) {
        when {
            nums1[i] > nums2[j] -> j++
            nums1[i] < nums2[j] -> i++
            nums1[i] == nums2[j] -> {
                nums1[k] = nums1[i]
                i++
                j++
                k++
            }
        }
    }

    return nums1.copyOfRange(0, k)
}