package com.ddanilov.newchallange

fun main() {
    val nums = intArrayOf(0, 0, 1, 1, 1, 2, 2, 3, 3, 4)
    val result = removeDuplicates(nums)

    print(result)
}


/**
 * 0, 0, 1, 1, 1, 2, 2, 3, 3, 4
 *       i
 *    k
 */
private fun removeDuplicates(nums: IntArray): Int {
    if (nums.isEmpty()) return 0
    var uniqueItemsCounter = 1

    for (i in 1 until nums.size) {
        if (nums[i] != nums[i - 1]) {
            nums[uniqueItemsCounter] = nums[i]
            uniqueItemsCounter++
        }
    }

    return uniqueItemsCounter
}