package com.ddanilov.newchallange

fun main() {
    val nums = intArrayOf(5, 2, 3, 1)

    val result = sortArray(nums)

    result.forEach {
        println(it)
    }
}


/**
 * 5, 2, 3, 1
 */
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

/**
 * [5,2]
 */
private fun merge(nums: IntArray, l: Int, r: Int, m: Int) {
    val left = nums.slice(l..m)
    val right = nums.slice(m + 1..r)

    var i = 0
    var j = 0
    var k = l

    while (i < left.size && j < right.size) {
        if (left[i] <= right[j]) {
            nums[k] = left[i]
            i++
        } else {
            nums[k] = right[j]
            j++
        }
        k++
    }

    while (i < left.size) {
        nums[k] = left[i]
        k++
        i++
    }

    while (j < right.size) {
        nums[k] = right[j]
        k++
        j++
    }
}


// 1. [5,2]
// 2. [5]
