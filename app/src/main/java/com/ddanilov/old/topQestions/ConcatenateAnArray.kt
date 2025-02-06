package com.ddanilov.topQestions

fun main() {
    val nums = intArrayOf(1, 2, 1)
    println(getConcatenation(nums).joinToString(" "))
}

private fun getConcatenation(nums: IntArray): IntArray {
    val answer = IntArray(nums.size * 2)

    for(i in nums.indices) {
        answer[i] = nums[i]
        answer[nums.size + i] = nums[i]
    }

    return answer
}
