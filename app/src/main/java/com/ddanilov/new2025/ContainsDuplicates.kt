package com.ddanilov.new2025

fun main() {

    val nums = intArrayOf(1, 2, 3, 1)

    val result = containsDuplicate(nums)

    println("XXX $result")

}

/**
 * 1, 2, 3, 2
 *
 * 1, 2, 2, 3
 *    l  r
 *
 */
private fun containsDuplicate(nums: IntArray): Boolean {
    var l = 0
    var r = 1

    nums.sort()

    while (r < nums.size) {
        if (nums[l] == nums[r]) {
            return true
        } else {
            l++
            r++
        }
    }
    return false
}


private fun containsDuplicateBruteFOrce(nums: IntArray): Boolean {
    for (i in nums.indices) {
        for (j in i + 1 until nums.size) {
            if (nums[i] == nums[j]) {
                return true
            }
        }
    }

    return false
}
