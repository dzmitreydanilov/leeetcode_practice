package com.ddanilov.topQestions

fun main() {
    val nums = intArrayOf(1, 3, 5, 6)
    val target = 6

    println(searchInsert(nums, target))
}

private fun searchInsert(nums: IntArray, target: Int): Int {
    if (nums.isEmpty()) return -1
    var l = 0
    var r = nums.lastIndex

    while (l <= r) {
        // 0 + (3 - 0) / 2 = 2
        val mid = l + (r - l) / 2

        if (nums[mid] == target) {
            return mid
        } else if (nums[mid] < target) {
            l = mid + 1
        } else if (nums[mid] > target) {
            r = mid - 1
        }
    }

    return -1
}
