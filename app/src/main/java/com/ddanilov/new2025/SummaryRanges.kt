package com.ddanilov.new2025

fun main() {
    val nums = intArrayOf(0, 1, 2, 4, 5, 7)

    val result = summaryRanges(nums)

    result.forEach {
        print("$it, ")
    }
}

/**
 * 0,1,2,4,5,7
 *           l
 *           r
 *
 *  r = 4
 */

private fun summaryRanges(nums: IntArray): List<String> {
    var l = 0
    var r = 1

    val result = mutableListOf<String>()

    while (r <= nums.size) {
        val startValue = nums[l]
        if (r < nums.size && nums[r] == nums[r - 1] + 1) {
            r++
        } else {
            result.add(toRange(startValue, nums[r - 1]))
            l = r
            r++
        }
    }

    return result
}

private fun toRange(nums1: Int, nums2: Int): String {
    return if (nums1 == nums2) {
        "$nums1"
    } else {
        "$nums1->$nums2"
    }
}
