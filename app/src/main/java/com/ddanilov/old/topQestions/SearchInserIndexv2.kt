package com.ddanilov.topQestions

fun main() {
    val nums = intArrayOf(1, 3, 5, 6)
    val target = 5
}

private fun searchInsert(nums: IntArray, target: Int): Int {
    if (nums.isEmpty()) return 0
    var l = 0
    var r = nums.lastIndex

    while (l <= r) {
        val mid = l + (r - l) / 2
        if (nums[mid] == target) {
            return mid
        } else if (nums[mid] < target) {
            l = mid  + 1

        } else {
            r = mid - 1

        }
    }

    return l
}
