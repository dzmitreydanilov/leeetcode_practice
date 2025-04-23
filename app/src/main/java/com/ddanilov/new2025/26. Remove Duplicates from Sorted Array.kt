package com.ddanilov.new2025

fun main() {
    val nums = intArrayOf(1, 1, 2)
    val result = removeDuplicates(nums)

    println(result)

}

/**
 * 1, 2, 2, 2, 3, 3
 *    l
 *    r
 */
private fun removeDuplicates(nums: IntArray): Int {
        var k = 1

        for (r in 1 until nums.size) {
            if (nums[r] != nums[r - 1]) {
                val temp = nums[r]
                nums[k] = temp
                k++
            }
        }

        return k
}