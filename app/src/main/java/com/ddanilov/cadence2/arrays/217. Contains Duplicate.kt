package com.ddanilov.cadence2.arrays


fun main() {
    val nums = intArrayOf(1, 1, 1, 3, 3, 4, 3, 2, 4, 2)
    val result = containsDuplicate(nums)

    println(result)
}

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