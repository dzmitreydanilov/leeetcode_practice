package com.ddanilov.topQestions

fun main() {
    val nums = intArrayOf(1, 1, 2)
    println(removeDuplicates(nums))
}

private fun removeDuplicates(nums: IntArray): Int {
    if (nums.isEmpty()) return 0
    var itemPointer = 1

    for (i in 1 until nums.size) {
        if (nums[i] != nums[i - 1]) {
            nums[itemPointer++] = nums[i]
        }
    }

    return itemPointer
}
