package com.ddanilov.new2025

fun main() {
    val nums = intArrayOf(1, 1, 1, 3, 3, 4, 3, 2, 4, 2)
    val result = containsDuplicate(nums)
    println(result)
}

/**
 *
 * 1,2,3,1
 *
 * [1,2,3]
 */
private fun containsDuplicate(nums: IntArray): Boolean {
    val set = mutableSetOf<Int>()

    nums.forEach {
        if(set.contains(it)) {
            return true
        }

        set.add(it)
    }

    return false
}