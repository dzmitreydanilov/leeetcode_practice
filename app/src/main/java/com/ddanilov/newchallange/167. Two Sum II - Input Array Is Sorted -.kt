package com.ddanilov.newchallange

fun main() {
    val numbers = intArrayOf(2, 7, 11, 15)
    val target = 9

    val result = twoSum(numbers, target)

    result.forEach {
        println(it)
    }
}

private fun twoSum(numbers: IntArray, target: Int): IntArray {
    var l = 0
    var r = numbers.lastIndex

    while (l <= r) {
        if (numbers[l] + numbers[r] == target) {
            return intArrayOf(l + 1, r + 1)
        } else if (numbers[l] + numbers[r] > target) {
            r--
        } else if (numbers[l] + numbers[r] < target) {
            l++
        }
    }

    return intArrayOf()
}