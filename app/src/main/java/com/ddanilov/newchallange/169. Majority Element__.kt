package com.ddanilov.newchallange

import kotlin.math.max

fun main() {
    val nums = intArrayOf(3, 2, 3)

    val result = majorityElement(nums)
}

private fun majorityElement(nums: IntArray): Int {
    var majorElement = 0
    var counter = 0

    for(num in nums) {
        if(counter == 0) majorElement = num

        counter += if(majorElement == num) 1 else -1
    }

    return majorElement
}