package com.ddanilov.topQestions

fun main() {
    val nums = intArrayOf(-2, 0, 3, -5, 2, -1)
    val numArray = NummArray(nums)
    println(numArray.sumRange(0, 2))
    println(numArray.sumRange(2, 5))
    println(numArray.sumRange(0, 5))
}

class NummArray(private val nums: IntArray) {

    private val prefixesList = mutableListOf<Int>()

    init {
        var sum = 0
        nums.forEach {
            sum += it
            prefixesList.add(sum)
        }
    }

    fun sumRange(left: Int, right: Int): Int {
        val rightSum = prefixesList[right]
        val leftSum = if (left > 0) prefixesList[left - 1] else 0
        return rightSum - leftSum
    }
}

