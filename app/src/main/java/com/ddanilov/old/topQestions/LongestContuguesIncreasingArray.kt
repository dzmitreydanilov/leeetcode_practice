package com.ddanilov.topQestions

fun main() {
    val nums = intArrayOf(1, 3, 5, 4, 7)
    println(findLengthOfLCIS(nums))
}

private fun findLengthOfLCIS(nums: IntArray): Int {
    var answer = 0
    var anchor = 0

    for (i in nums.indices) {
        if (i > 0 && nums[i - 1] >= nums[i]) anchor = i

        answer = maxOf(answer, i - anchor + 1)
    }
    return answer
}
