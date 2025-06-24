package com.ddanilov.newchallange

fun main() {
    val nums = intArrayOf(2, 0, 2, 1, 1, 0)
    sortColors(nums)
}

private fun sortColors(nums: IntArray): Unit {
    val result = mergeSort(nums = nums, l = 0, r = nums.lastIndex)
    result.forEach {
        println(it)
    }
}


private fun mergeSort(nums: IntArray, l: Int, r: Int): IntArray {
    if (l == r) return nums

    val m = (l + r) / 2

    mergeSort(nums, l, m)
    mergeSort(nums, m + 1, r)

    merge(nums, l, r, m)

    return nums
}

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
        i++
        k++
    }
    while (j < right.size) {
        nums[k] = right[j]
        j++
        k++
    }
}