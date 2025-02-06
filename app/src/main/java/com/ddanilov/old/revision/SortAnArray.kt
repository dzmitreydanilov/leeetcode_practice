package com.ddanilov.revision

fun main() {
    val nums = intArrayOf(5, 2, 3, 1)
    val result = sortArray(nums)

    println(result.joinToString(""))
}

// Target tc O(nlogn)
private fun sortArray(nums: IntArray): IntArray {
    return mergeSort(nums, 0, nums.lastIndex)
}


private fun mergeSort(nums: IntArray, l: Int, r: Int): IntArray {
    if (l == r) return nums
    val m = (l + r) / 2

    mergeSort(nums, l, m)
    mergeSort(nums, m + 1, r)
    mergeArray(nums, m, l, r)

    return nums
}

private fun mergeArray(nums: IntArray, m: Int, l: Int, r: Int): IntArray {
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
