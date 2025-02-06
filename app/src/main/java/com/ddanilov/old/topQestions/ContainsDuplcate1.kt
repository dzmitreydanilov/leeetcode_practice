package com.ddanilov.topQestions

fun main() {
    val nums = intArrayOf(1, 2, 3, 1)
    println(containsDuplicate(nums))
}

private fun containsDuplicate(nums: IntArray): Boolean {
    val set = HashSet<Int>()
    for (i in nums.indices) {
        if (!set.add(nums[i])) {
            return true
        }
    }
    return false
}
