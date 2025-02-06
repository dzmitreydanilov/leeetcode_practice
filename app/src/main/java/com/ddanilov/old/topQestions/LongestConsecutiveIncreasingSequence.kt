package com.ddanilov.topQestions

fun main() {
    val nums = intArrayOf(1, 3, 5, 4, 7)

    println(findLengthOfLCIS(nums))
}

// TC O(n)
// SC O(1)
private fun findLengthOfLCIS(nums: IntArray): Int {
    var answer = 0
    var anchor = 0

    for(i in nums.indices) {
        if(i > 0 && nums[i - 1] >= nums[i]) anchor = i

        answer = maxOf(answer, i - anchor + 1)
    }

    return answer
}
// i = 3
// answer = 3
// anchor = 2

