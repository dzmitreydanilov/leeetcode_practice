package com.ddanilov.topQestions

fun main() {
    val nums = intArrayOf(1, 1, 2, 4, 2, 5, 4, 2)
    println(removeDuplicates(nums))
}

// 1,1,2
private fun removeDuplicates(nums: IntArray): Int {
    if (nums.isEmpty()) return 0
    var pointerL = 1

    for (i in 1 until nums.size) {
        if (nums[i] != nums[i - 1]) {
            nums[pointerL] = nums[i]
            pointerL++
        }
    }

    return pointerL
}
