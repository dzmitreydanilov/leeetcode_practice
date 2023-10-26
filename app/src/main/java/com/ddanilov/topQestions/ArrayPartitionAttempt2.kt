package com.ddanilov.topQestions

import java.util.Arrays

fun main() {
    val nums = intArrayOf(1, 4, 3, 2)

}

private fun arrayPairSum(nums: IntArray): Int {
    var max = 0

    Arrays.sort(nums)

    for (i in nums.indices step 2) {
        max += nums [i]
    }

    return max
}
