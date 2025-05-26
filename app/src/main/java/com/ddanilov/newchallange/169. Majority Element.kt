package com.ddanilov.newchallange

fun main() {
    val nums = intArrayOf(2, 2, 1, 1, 1, 2, 2)
    val result = majorityElement(nums)

    println(result)
}

/**
 *
 */
private fun majorityElement(nums: IntArray): Int {
    var majorElement = 0
    var counter = 0

    for (num in nums) {
        if (counter == 0) {
            majorElement = num
        }

        counter += if (majorElement == num) 1 else -1
    }

    return majorElement
}