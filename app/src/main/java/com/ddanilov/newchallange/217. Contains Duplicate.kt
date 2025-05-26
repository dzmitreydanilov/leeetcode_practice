package com.ddanilov.newchallange

fun main() {
    val nums = intArrayOf(1, 2, 3)

    val result = containsDuplicate(nums)

    println(result)
}


/**
 * 1, 2, 3, 1
 *
 *
 * [1, 2, 3]
 */
private fun containsDuplicate(nums: IntArray): Boolean {
    val seen = mutableSetOf<Int>()

    for (num in nums) {
        if (seen.contains(num)) {
            return true
        } else {
            seen.add(num)
        }
    }

    return false
}