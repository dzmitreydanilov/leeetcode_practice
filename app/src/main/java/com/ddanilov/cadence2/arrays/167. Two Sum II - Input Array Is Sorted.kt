package com.ddanilov.cadence2.arrays

fun main() {
    val nums = intArrayOf(2, 7, 11, 15)
    val target = 9
    val result = twoSum(nums, target)

    result.forEach {
        println(it)
    }
}

/**
 * 2, 7, 11, 15
 * i
 *    j
 * target = 0
 */
private fun twoSum(numbers: IntArray, target: Int): IntArray {
    var i = 0
    var j = numbers.lastIndex

    while (i < j) {
        if (numbers[i] + numbers[j] == target) {
            return intArrayOf(i + 1, j + 1)
        } else if (numbers[i] + numbers[j] > target) {
            j--
        } else {
            i++
        }
    }

    return intArrayOf()
}