package com.ddanilov.topQestions

fun main() {
    val nums = intArrayOf(0, 1, 0, 3, 12)
    println(moveZeros(nums).joinToString(" "))
}


// TC 0(N)
// SC O(n)
private fun moveZeros(nums: IntArray): IntArray {
    var insertIndex = 0

    nums.forEach {
        if (it != 0) {
            nums[insertIndex] = it
            insertIndex++
        }
    }

    while (insertIndex < nums.size) {
        nums[insertIndex] = 0
        insertIndex++
    }
    return nums
}
