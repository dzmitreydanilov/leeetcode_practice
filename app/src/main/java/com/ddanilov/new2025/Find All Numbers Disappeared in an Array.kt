package com.ddanilov.new2025

import kotlin.math.abs

fun main() {
    val nums = intArrayOf(4, 3, 2, 7, 8, 2, 3, 1)
    val result = findDisappearedNumbers(nums)

    result.forEach {
        println("XXX $it,")
    }
}

/**
 * 4, 3, 2, 7, 8, 2, 3, 1
 *
 * 1,2,3,3,4,7,8
 * l
 */

private fun findDisappearedNumbersBrut(nums: IntArray): List<Int> {

    val array = IntArray(nums.size)
    val result = mutableListOf<Int>()

    for (i in nums.indices) {
        array[i] = i + 1
    }

    for (i in array.indices) {
        if (!nums.contains(array[i])) result.add(array[i])
    }

    return result
}

/**
 * 4, 3, 2, 7, 8, 2, 3, 1
 */
private fun findDisappearedNumbersBrut2(nums: IntArray): List<Int> {

    val set = hashSetOf<Int>()

    for (i in nums.indices) {
        set.add(i + 1)
    }

    for (i in nums) {
        if (set.contains(i)) {
            set.remove(i)
        }
    }
    return set.toList()
}


/**
 * 4, 3, 2, 7, 8, 2, 3, 1
 *
 *
 * [1, 2, 3, 4, 5, 6, 7, 8]
 * [-4,-3,-4,     8, 2,     ]
 */
private fun findDisappearedNumbers(nums: IntArray): List<Int> {
    for (i in nums.indices) {
        val selectedValue = abs(nums[i])
        val index = selectedValue - 1
        val value = -abs(nums[index])
        nums[index] = value
    }

    val result = mutableListOf<Int>()

    for (i in nums.indices) {
        if (nums[i] > 0) {
            result.add(i + 1)
        }
    }

    return result
}
