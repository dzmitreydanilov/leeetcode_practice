package com.ddanilov.new2025

fun main() {
    val nums = intArrayOf(3, 2, 3)
    val result = majorityElement(nums)
    println(result)

}


/**
 * 3, 2, 3
 *
 *
 */
private fun majorityElement(nums: IntArray): Int {
    var counter = 0
    var majorElement = 0

    for (i in nums.indices) {
        if (counter == 0) {
            majorElement = nums[i]
        }

        counter += if (majorElement == nums[i]) 1 else -1
    }

    return majorElement
}
