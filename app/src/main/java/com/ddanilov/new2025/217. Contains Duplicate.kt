package com.ddanilov.new2025

import java.util.Arrays

fun main() {
    val nums = intArrayOf(1, 2, 3, 1)
    val result = containsDuplicate(nums)

    println(result)
}

/**
 * 1, 2, 3, 1
 *
 * {
 *  1 to 1
 *  2 to 0
 *  3 to 0
 *
 *
 *
 */
private fun containsDuplicate(nums: IntArray): Boolean {
    val map = mutableMapOf<Int, Int>()

    for (i in nums.indices) {
        map[nums[i]] = map.getOrDefault(nums[i], 0) + 1
    }


    return map.values.any { it >= 2 }
}

private fun containsDuplicateSort(nums: IntArray): Boolean {
    Arrays.sort(nums)

    var l = 0

    for (r in 1 until nums.size) {
        if (nums[l] == nums[r]) {
            return true
        }
        l++
    }

    return false
}

private fun containsDuplicateSet(nums: IntArray): Boolean {
    val set = mutableSetOf<Int>()

    nums.forEach {
        if (set.contains(it)) {
            return true
        }
        set.add(it)
    }

    return false
}