package com.ddanilov.revision

fun main() {
    val nums = intArrayOf(1, 2, 3, 4)
    val result = productExceptSelf1(nums)

    println(result.joinToString(" "))
}

// SC O(n)
// TC O(n)
private fun productExceptSelf(nums: IntArray): IntArray {
    val prefix = IntArray(nums.size)
    val postfix = IntArray(nums.size)
    // fill prefix
    prefix[0] = nums[0]
    for (i in 1 until nums.size) {
        prefix[i] = prefix[i - 1] * nums[i]
    }
    // fill postfix
    postfix[nums.lastIndex] = nums.last()
    for (i in nums.lastIndex - 1 downTo 0) {
        postfix[i] = postfix[i + 1] * nums[i]
    }

    for (i in nums.indices) {
        if (i == 0) {
            nums[i] = postfix[i + 1]
        } else if (i == nums.size - 1) {
            nums[i] = prefix[i - 1]
        }

        if (i != 0 && i < nums.size - 1) {
            nums[i] = prefix[i - 1] * postfix[i + 1]
        }
    }

    return nums
}


private fun productExceptSelf1(nums: IntArray): IntArray {
    val resultArray = IntArray(nums.size)
    var prefix = 1
    for (i in nums.indices) {
        resultArray[i] = prefix
        prefix *= nums[i]
    }

    var postfix = 1
    for(i in nums.indices) {
        resultArray[i] *= postfix
        postfix *= nums[i]
    }
    return resultArray
}
