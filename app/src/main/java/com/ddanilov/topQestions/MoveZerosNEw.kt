package com.ddanilov.topQestions

fun main() {
    val nums = intArrayOf(0, 1, 0, 3, 12)

    moveZeroes(nums)
}

private fun moveZeroes(nums: IntArray): Unit {
    var insertIndex = 0

    for (num in nums) {
        if (num != 0) {
            nums[insertIndex] = num
            insertIndex++
        }
    }

    while (insertIndex < nums.size) {
        nums[insertIndex] = 0
        insertIndex++
    }

    println(nums.joinToString(" "))
}
