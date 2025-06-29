package com.ddanilov.newchallange

fun main() {
    val nums = intArrayOf(5, 2, 3, 1)
    val result = sortArray(nums)

    result.forEach {
        println(it)
    }
}

private fun sortArray(nums: IntArray): IntArray {
    return mergeSort(nums, 0, nums.lastIndex)
}

private fun mergeSort(nums: IntArray, l: Int, r: Int): IntArray {
    if (l == r) return nums

    val m = (l + r) / 2

    mergeSort(nums, l, m)
    mergeSort(nums, m + 1, r)
    merge(nums, l, r, m)

    return nums
}

private fun merge(nums: IntArray, L: Int, R: Int, M: Int) {
    val left = nums.slice(L..M)
    val right = nums.slice(M + 1..R)

    var l = 0
    var r = 0
    var k = L

    while (l < left.size && r < right.size) {
        if (left[l] <= right[r]) {
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
