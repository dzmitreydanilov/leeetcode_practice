package com.ddanilov.revision

fun main() {
    val nums = intArrayOf(1, 2, 3, 4)
    val result = productExceptSelf(nums)

    println(result.joinToString(""))
}

private fun productExceptSelf(nums: IntArray): IntArray {
    var multiplyResult = 1

    nums.forEach {
        multiplyResult *= it
    }

    for (i in nums.indices) {
        val result = multiplyResult / nums[i]
        nums[i] = result
    }

    return nums
}
