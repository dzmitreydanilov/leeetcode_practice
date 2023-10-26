package com.ddanilov.topQestions

fun main() {
    val nums = intArrayOf(5, 2, 3, 1)

    println(sortArray(nums).joinToString(" "))
}

private fun sortArray(nums: IntArray): IntArray {
    return mergeSort(nums, 0, nums.lastIndex)
}


private fun mergeSort(nums: IntArray, left: Int, right: Int): IntArray {
    if (left == right) return nums
    val mid = (left + right) / 2

    mergeSort(nums, left, mid)
    mergeSort(nums, mid + 1, right)
    return merge(nums, mid, right, left)
}

private fun merge(nums: IntArray, m: Int, r: Int, l: Int): IntArray {
    val left = nums.copyOfRange(l, m + 1)
    val right = nums.copyOfRange(m + 1, r + 1)
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
        j++
        i++
    }
    while (k < right.size) {
        nums[i] = right[k]
        k++
        i++
    }

    return nums
}
