package com.ddanilov.cadence2.arrays

fun main() {
    val nums = intArrayOf(2, 2, 1, 1, 1, 2, 2)

    val result = majorityElement(nums)

    println(result)
}

private fun majorityElement(nums: IntArray): Int {
    var counter = 0
    var majorityElement = 0

    for (num in nums) {
        if (counter == 0) {
            majorityElement = num
        }


        counter += if (majorityElement == num) 1 else -1
    }

    return majorityElement
}