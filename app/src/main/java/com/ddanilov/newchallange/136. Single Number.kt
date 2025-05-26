package com.ddanilov.newchallange

fun main() {
    val nums = intArrayOf(2, 2, 1)

    val result = singleNumber(nums)

    println(result)
}

private fun singleNumber(nums: IntArray): Int {
    var result = 0

    nums.forEach {
        result = result xor it
    }

    return result
}

/**
 * 2, 2, 1
 */
private fun singleNumber1(nums: IntArray): Int {
    val set = mutableSetOf<Int>()

    nums.forEach {
        if (!set.contains(it)) {
            set.add(it)
        } else {
            set.remove(it)
        }
    }

    return set.first()
}