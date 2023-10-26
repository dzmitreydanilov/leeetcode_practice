package com.ddanilov.topQestions

import java.util.Arrays

fun main() {
    val nums = intArrayOf(1, 3, 2, 2, 5, 2, 3, 7)

    println(findLHS(nums))
}

private fun findLHS(nums: IntArray): Int {
    Arrays.sort(nums)
    // 1,2,2,2,3,3,5,7
    var answer = 0
    var l = 0
    var r = 1

    while (r < nums.size) {
        // 1
        val diff = nums[r] - nums[l]

        if (diff == 1) {
            //2
            answer = maxOf(answer, r - l + 1)
        }

        if (diff <= 1) {
            r++
        } else {
            l++
        }
    }

    return answer

}
