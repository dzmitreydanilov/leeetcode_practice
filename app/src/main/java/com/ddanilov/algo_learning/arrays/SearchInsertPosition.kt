package com.ddanilov.algo_learning.arrays

fun main() {
    val nums = intArrayOf(1, 3, 5, 6)
    val target = 5
    val result = searchInsert1(nums, target)

    println(result)

}

private fun searchInsert(nums: IntArray, target: Int): Int {
    var index = 0
    for (i in nums.indices) {
        when {
            target == nums[i] -> index = i
            target > nums.last() -> index = i + 1
            target > nums[i] && target < nums[i + 1] -> index = i + 1
        }
    }

    return index
}

private fun searchInsert1(nums: IntArray, target: Int): Int {
    var low = 0
    var high = nums.size - 1

    while (low <= high) {
        val mid = low + (high - low) / 2
        if (nums[mid] == target) {
            return mid
        } else if (nums[mid] > target) {
            high = mid - 1
        } else {
            low = mid + 1
        }
    }
    return low
}
