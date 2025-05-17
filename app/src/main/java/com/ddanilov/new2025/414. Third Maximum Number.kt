package com.ddanilov.new2025

fun main() {
    val nums = intArrayOf(3, 2)

    val result = thirdMax(nums)

    println(result)
}


/**
 * 3, 2
 */
private fun thirdMax(nums: IntArray): Int {
    var first: Int? = null
    var second: Int? = null
    var third: Int? = null

    for (num in nums) {

        if (num == first || num == second || num == third) continue

        if (first == null || first < num) {
            third = second
            second = first
            first = num
        } else if (second == null || second < num) {
            third = second
            second = num
        } else if (third == null || third < num) {
            third = num
        }
    }

    return third ?: first!!
}