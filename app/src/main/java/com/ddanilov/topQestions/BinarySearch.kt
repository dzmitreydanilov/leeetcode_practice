package com.ddanilov.topQestions

fun main() {
    val nums = intArrayOf(-1, 0, 3, 5, 9, 12)
    val target = 5

    println(search(nums, target))
}

// sort, find mid, while l <= r
private fun search(nums: IntArray, target: Int): Int {
    var l = 0
    var r = nums.lastIndex

    while (l <= r) {
        val mid = l + (r - l) / 2

        if (nums[mid] == target) {
            return mid
        } else if (nums[mid] < target) {
            l = mid + 1
        } else if(nums[mid] > target) {
            r = mid - 1
        }
    }

    return -1
}
