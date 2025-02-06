package com.ddanilov.topQestions

fun main() {
    val nums = intArrayOf(0, 1)

    println(missingNumber(nums))
}

private fun missingNumber(nums: IntArray): Int {
    if (nums.isEmpty()) return 0
    val set = (0..nums.size).toMutableSet()

    nums.forEach {
        set.remove(it)
    }

    return set.first()
}
