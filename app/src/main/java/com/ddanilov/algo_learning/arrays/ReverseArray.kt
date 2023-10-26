package com.ddanilov.algo_learning.arrays

fun main() {
    val array = intArrayOf(1, 2, 3, 5, 6, 7)
    val k = 3

    rotate(array, k)

    println(array.joinToString(""))
}


// TC O(n)
// SC O(1)
fun rotate(nums: IntArray, k: Int) {
//    if (nums.size == 1 || k == 0 || k == nums.size) return

    val kNew = k % nums.size
    // reverse whole array
    reverse(nums, 0, nums.size - 1)
    // reverse [0, k-1]
    reverse(nums, 0, kNew - 1)
    // reverse [k, nums.size-1]
    reverse(nums, kNew, nums.size - 1)
}

// (1, 2, 3, 5, 6, 7)
private fun reverse(nums: IntArray, start: Int, end: Int) {
    var (i, j) = Pair(start, end)
    while (i < j) {
        val temp = nums[i]
        nums[i] = nums[j]
        nums[j] = temp
        i++
        j--
    }
}

