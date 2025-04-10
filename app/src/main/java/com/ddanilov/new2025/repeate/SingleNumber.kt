package com.ddanilov.new2025.repeate

fun main() {

    val nums = intArrayOf(2, 2, 1)

    val result = singleNumber(nums)

    println("XX $result")

}

private fun singleNumber(nums: IntArray): Int {
    var result = 0
    nums.forEach {
        result = it xor result
    }

    return result
}
