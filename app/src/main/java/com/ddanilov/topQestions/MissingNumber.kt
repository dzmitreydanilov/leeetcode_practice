package com.ddanilov.topQestions

fun main() {
    val nums = intArrayOf(3, 0, 1)

    println(missingNumber2(nums))
}

// TC O(n^2)
private fun missingNumber(nums: IntArray): Int {
    val size = nums.size

    for (i in 0..size) {
        if (nums.contains(i)) continue else return i
    }

    return -1
}


private fun missingNumber1(nums: IntArray): Int {
    // (3 * (3 + 1))/2
    // 12 / 2
    // 6
    val itemsSum = (nums.size * (nums.size + 1)) / 2
    var result = itemsSum

    nums.forEach {
        // 6 - 3 = 3
        // 3 - 0 = 3
        // 3 - 1 = 2
        result -= it
    }

    return result
}

private fun missingNumber2(nums: IntArray): Int {
    var xorResult = 0

    for (i in 0..nums.size) {
        xorResult = xorResult xor i
    }
    println(xorResult)
    nums.forEach {
        xorResult = xorResult xor it
    }

    return xorResult
}
