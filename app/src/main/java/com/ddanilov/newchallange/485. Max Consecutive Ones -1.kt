package com.ddanilov.newchallange

fun main() {
    val nums = intArrayOf(1, 0, 1, 1, 0, 1)

    val result = findMaxConsecutiveOnes(nums)

    print(result)
}

private fun findMaxConsecutiveOnes(nums: IntArray): Int {
    var count = 0
    var max = 0

    nums.forEach {
        if (it == 1) {
            count++
            max = maxOf(count, max)
        } else {
            count = 0
        }
    }

    return max
}
