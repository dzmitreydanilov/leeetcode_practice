package com.ddanilov.new2025.repeate

fun main() {

    val nums = intArrayOf(3, 2, 3)

    val result = majorityElement(nums)

    println("XXX $result")
}

/**
 * 3, 2, 3, 4
 *          l
 * mE = 3
 * count = 0
 */
private fun majorityElement(nums: IntArray): Int {
    var majorElement = 0
    var count = 0

    nums.forEach {
        if (count == 0) {
            majorElement = it
        }

        count += if (majorElement == it) 1 else -1
    }
    return majorElement

}