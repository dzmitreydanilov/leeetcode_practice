package com.ddanilov.new2025.repeate

fun main() {
    val nums = intArrayOf(9, 6, 4, 2, 3, 5, 7, 0, 1)

    val result = missingNumber(nums)

    println(result)

}

private fun missingNumber(nums: IntArray): Int {
    var itemsSum = (nums.size * (nums.size + 1)) / 2

    nums.forEach {
        itemsSum -= it
    }

    return itemsSum
}
