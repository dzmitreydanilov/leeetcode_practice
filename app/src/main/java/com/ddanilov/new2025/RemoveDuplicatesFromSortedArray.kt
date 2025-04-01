package com.ddanilov.new2025

fun main() {
    val nums = intArrayOf(1, 1, 2)
    val result = removeDuplicatesBrutForce(nums)

    println("XXXX result $result")
}

// 1, 1, 2, 6, 8, 9, 9, 10, 11, 12
//     l
//     r
fun removeDuplicatesBrutForce(nums: IntArray): Int {
    var l = 1
    for (r in 1 until nums.size) {
        if (nums[r] != nums[r - 1]) {
            nums[l] = nums[r]
            l++
        }
    }

    return l
}
