package com.ddanilov.new2025.challange150

fun main() {
    val nums = intArrayOf(1, 2, 3, 1)

    val result = containsDuplicate(nums)

    println(result)
}

/**
 * 1, 2, 3, 1
 *
 * [1, 2, 3 ]
 */
private fun containsDuplicate(nums: IntArray): Boolean {
    val seen = mutableSetOf<Int>()

    nums.forEach {
        if (seen.contains(it)) {
            return true
        } else {
            seen.add(it)
        }
    }

    return false
}