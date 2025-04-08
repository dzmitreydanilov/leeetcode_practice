package com.ddanilov.new2025.repeate

fun main() {

    val nums = intArrayOf(1, 2, 3, 1)

    val result = containsDuplicateSet(nums)

    println("XXX $result")
}


private fun containsDuplicateSet(nums: IntArray): Boolean {
    val set = mutableSetOf<Int>()

    for (num in nums) {
        if (set.contains(num)) {
            return true
        }

        set.add(num)
    }

    return false
}

/**
 * 1, 1, 2, 3
 * l
 *    r
 *
 * 1, 4, 6, 8, 9
 *       l
 *          r
 */


private fun containsDuplicate(nums: IntArray): Boolean {

    nums.sort()

    var l = 0
    var r = 1

    while (r < nums.size) {
        if (nums[l] == nums[r]) {
            return true
        }
        r++
        l++
    }
    return false
}

/**
 * 1,2,3,1
 */
private fun containsDuplicateBrut(nums: IntArray): Boolean {

    for (i in nums.indices) {
        for (j in i + 1 until nums.size) {
            if (nums[i] == nums[j]) {
                return true
            }
        }
    }

    return false
}
