package com.ddanilov.topQestions

fun main() {
    val nums = intArrayOf(12, 345, 2, 6, 7896)
    println(findNumbers(nums))
}

private fun findNumbers(nums: IntArray): Int {
    var answer = 0

    for (num in nums) {
        if (num.toString().length % 2 == 0) answer++
    }

    return answer
}
