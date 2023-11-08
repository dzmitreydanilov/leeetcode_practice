package com.ddanilov.topQestions

fun main() {
    val nums = intArrayOf(1, 2, 3, 1)

    println(containsDuplicate(nums))
}

private fun containsDuplicate(nums: IntArray): Boolean {
    val numsSet = HashSet<Int>()
    for (num in nums) {
        if (!numsSet.add(num)) {
            return true
        }
    }

    return false
}
