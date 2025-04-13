package com.ddanilov.new2025.repeate


fun main() {
    val nums = intArrayOf(3, 2, 3)

    val result = majorityElement(nums)

    println("XX $result")
}

/**
 * 3, 2, 3
 *
 * mE = 3
 * c = 0
 */
private fun majorityElement(nums: IntArray): Int {
    var counter = 0
    var majorElement = 0

    nums.forEach {
        if (counter == 0) {
            majorElement = it
        }

        counter += if (majorElement == it) 1 else -1
    }

    return majorElement
}