package com.ddanilov.new2025

fun main() {
    val nums = intArrayOf(4, 1, 2, 1, 2)
    val result = singleNumber(nums)

    println("XXXX $result")
}


/**
 * 2, 2, 1
 *    l     r
 */
private fun singleNumberBrut(nums: IntArray): Int {
    val set = HashSet<Int>()
    nums.forEach {
        if (set.contains(it)) {
            set.remove(it)
        } else {
            set.add(it)
        }
    }
    return set.first()
}

private fun singleNumber(nums: IntArray): Int {
    var result = 0
    nums.forEach {
        result = result xor it
    }

    return result
}