package com.ddanilov.newchallange

fun main() {
    val nums = intArrayOf(1, 2, 3, 4, 5)

    val result = increasingTriplet(nums)

    print(result)
}

/**
 *                p
 * 2, 1, 5, 0, 4, 6
 *          i  j
 *
 * i = 0
 * j = 4
 */
private fun increasingTriplet(nums: IntArray): Boolean {
    var valueI = Int.MAX_VALUE
    var valueJ = Int.MAX_VALUE

    for (num in nums) {
        if (num <= valueI) {
            valueI = num
        } else if(num <= valueJ) {
            valueJ = num
        } else {
            return true
        }
    }

    return false
}