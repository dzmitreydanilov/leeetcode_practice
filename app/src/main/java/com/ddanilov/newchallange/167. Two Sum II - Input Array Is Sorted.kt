package com.ddanilov.newchallange

fun main() {
    val nums = intArrayOf(1, 3, 4, 5, 7, 10, 11)
    val target = 9

    val result = twoSum(nums, target)

    result.forEach {
        println(it)
    }
}

private fun twoSum(numbers: IntArray, target: Int): IntArray {
    var l = 0
    var r = numbers.lastIndex

    while (l < r) {
        val sum = numbers[l] + numbers[r]
        if (sum == target) {
            return intArrayOf(l + 1, r + 1)
        } else if (sum > target) {
            r--
        } else {
            l++
        }
    }
    return intArrayOf()
}

private fun twoSumB(numbers: IntArray, target: Int): IntArray {
    for (i in numbers.indices) {
        for (j in i + 1 until numbers.size) {
            val sum = numbers[i] + numbers[j]
            if (sum == target) {
                return intArrayOf(i + 1, j + 1)
            } else if (sum > target) {
                break
            }
        }
    }

    return intArrayOf()
}