package com.ddanilov.cadence2.arrays

fun main() {
    val nums = intArrayOf(2, 0, 2, 1, 1, 0)

    sortColors(nums)
}

private fun sortColors(nums: IntArray): Unit {
    mergeSort(nums, 0, nums.lastIndex)
}

private fun mergeSort(nums: IntArray, l: Int, r: Int): IntArray {
    if (l == r) return nums

    val m = (l + r) / 2

    mergeSort(nums, l, m)
    mergeSort(nums, m + 1, r)
    merge(nums, l, r, m)

    return nums
}

private fun merge(nums: IntArray, s: Int, e: Int, m: Int) {
    val left = nums.slice(s..m)
    val right = nums.slice(m + 1..e)

    var l = 0
    var r = 0
    var k = s

    while (l < left.size && r < right.size) {
        if (left[l] < right[r]) {
            nums[k] = left[l]
            l++
        } else {
            nums[k] = right[r]
            r++
        }
        k++
    }

    while (l < left.size) {
        nums[k] = left[l]
        l++
        k++
    }

    while (r < right.size) {
        nums[k] = right[r]
        r++
        k++
    }
}