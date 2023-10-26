package com.ddanilov.topQestions

fun main() {
    val nums = intArrayOf(2, 0, 2, 1, 1, 0)
    println(mergeSort(nums, 0, nums.lastIndex).joinToString(" "))
}

private fun mergeSort(nums: IntArray, left: Int, right: Int): IntArray {
    if (left == right) return nums
    val mid = (left + right) / 2
    mergeSort(nums, left, mid)
    mergeSort(nums, mid + 1, right)

    return mergeArrays(nums, left, right, mid)
}


private fun mergeArrays(nums: IntArray, l: Int, r: Int, mid: Int): IntArray {
    val left = nums.copyOfRange(l, mid + 1)
    val right = nums.copyOfRange(mid + 1, r + 1)
    var i = l
    var j = 0
    var k = 0

    while (j < left.size && k < right.size) {
        if (left[j] < right[k]) {
            nums[i] = left[j]
            j++
        } else {
            nums[i] = right[k]
            k++
        }
        i++
    }

    while (j < left.size) {
        nums[i] = left[j]
        i++
        j++
    }

    while (k < right.size) {
        nums[i] = right[k]
        i++
        k++
    }

    return nums
}
