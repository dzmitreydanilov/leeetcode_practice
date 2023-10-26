package com.ddanilov.topQestions

fun main() {
    val nums = intArrayOf(1, 2, 3, 4)
    val result = productExceptSelf(nums)

    println(result.joinToString(" "))
}

private fun productExceptSelf(nums: IntArray): IntArray {
    var multiplyResult = 1

    nums.forEach {
        multiplyResult *= it
    }

    for (i in nums.indices) {
        nums[i] = multiplyResult / nums[i]
    }

    return nums
}
