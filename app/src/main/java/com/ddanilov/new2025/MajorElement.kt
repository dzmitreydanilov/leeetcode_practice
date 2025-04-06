package com.ddanilov.new2025

fun main() {

    val nums = intArrayOf(3, 2, 3)

    val result = majorityElement(nums)

    println("XXX $result")
}


/**
 * 3,2,3
 *     m
 *
 *   count = 0
 */
private fun majorityElement(nums: IntArray): Int {
    var majorElement = 0
    var count = 0

    for (num in nums) {
        if (count == 0) {
            majorElement = num
        }

        count += if (num == majorElement) 1 else -1
    }

    return majorElement
}

private fun majorityElementMap(nums: IntArray): Int {
    val countMap = mutableMapOf<Int, Int>()
    val majorityTrashHold = nums.size / 2

    for (num in nums) {
        val newCount = countMap.getOrDefault(num, 0) + 1
        countMap[num] = newCount

        if (newCount > majorityTrashHold) {
            return num
        }
    }

    return 0
}