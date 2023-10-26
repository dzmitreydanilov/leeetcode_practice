package com.ddanilov.revision

fun main() {
    val nums = intArrayOf(2, 2, 1, 1, 2, 2)
    val res = majorityElement(nums)

    println(res)
}

// 0(nlogn)
// O(1)
private fun majorityElement1(nums: IntArray): Int {
    nums.sort()
    val midItemIndex = nums.size / 2
    return nums[midItemIndex]
}

// o(n)
// o(1)
private fun majorityElement(nums: IntArray): Int {
    var majorNum = 0
    var counter = 0

    nums.forEach { num ->
        if (counter == 0) {
            majorNum = num
        }

        if (num == majorNum) {
            counter++
        } else {
            counter--
        }
    }

    return majorNum
}


