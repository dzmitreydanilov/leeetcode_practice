package com.ddanilov.newchallange

fun main() {
    val nums = intArrayOf(5, 2, 3, 1)

    val result = sortArray(nums)

    result.forEach {
        println(it)
    }
}


/**
 *                  5, 2, 3, 1
 *
 * m=1            5,2
 * m=0           5  2
 *
 *
 *
 *
 */
private fun sortArray(nums: IntArray): IntArray {
    return mergeSort(nums, 0, nums.lastIndex)
}

/**
 * 5,2
 * l = 0, r = 1
 * m = 0
 */

private fun mergeSort(nums: IntArray, l: Int, r: Int): IntArray {
    if (l == r) return nums

    val m = (l + r) / 2

    mergeSort(nums, l, m)
    mergeSort(nums, m + 1, r)
    merge(nums, l, r, m)

    return nums
}


/**
 * 5,2
 * l = 0, r = 1, m = 0
 *
 * left = 5
 * right = 2
 */
private fun merge(nums: IntArray, l: Int, r: Int, m: Int) {
    val numsLeft = nums.slice(l..m)
    val numsRight = nums.slice(m + 1..r)

    var i = 0
    var j = 0
    var k = l

    while (i < numsLeft.size && j < numsRight.size) {
        if (numsLeft[i] <= numsRight[j]) {
            nums[k] = numsLeft[i]
            i++
        } else {
            nums[k] = numsRight[j]
            j++
        }
        k++
    }

    while (i < numsLeft.size) {
        nums[k] = numsLeft[i]
        i++
        k++
    }

    while (j < numsRight.size) {
        nums[k] = numsRight[j]
        j++
        k++
    }
}