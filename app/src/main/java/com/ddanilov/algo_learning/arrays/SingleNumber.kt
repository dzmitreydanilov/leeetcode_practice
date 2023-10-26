package com.ddanilov.algo_learning.arrays

fun main() {
    val array = intArrayOf(4, 1, 2, 1, 2)
    val result = singleNumber(array)

    println(result)
}

private fun singleNumber(nums: IntArray): Int {
    var result = 0
    for (num in nums) {
        result = result xor num
        // 0 xor 4
    }

    return result
}

// 0 xor 4 = 4
// 0
// 100
// 100

// 4 xor 1 = 5
// 100
//   1
// 101

// 5 xor 2 = 7
// 101
//  10
// 111 = 2^2 2^1  2^0 = 4 2 1 = 7

//7 xor 1 = 6
// 111
//   1
// 110 = 2^2 2^1 2^0 = 4+2+0 = 6

//6 xor 2 =
// 110
//  10
// 100 = 2^2 = 4

// 5 xor 5

// 110
// 110
// 000
