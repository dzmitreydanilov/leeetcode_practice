package com.ddanilov.cadence2.arrays

fun main() {
    val nums = intArrayOf(1, 2, 3, 4, 5)

    val result = increasingTriplet(nums)

    println(result)
}

private fun increasingTriplet(nums: IntArray): Boolean {
    var valueI = Int.MAX_VALUE
    var valueJ = Int.MAX_VALUE

    for (num in nums) {
        if (num <= valueI) {
            valueI = num
        } else if (num <= valueJ) {
            valueJ = num
        } else {
            return true
        }
    }

    return false
}