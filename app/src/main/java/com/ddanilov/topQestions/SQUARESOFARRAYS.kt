package com.ddanilov.topQestions

fun main() {
    val nums = intArrayOf(-1)

    println(sortedSquares(nums).joinToString(" "))
}

private fun sortedSquares(nums: IntArray): IntArray {
    val size = nums.size
    var positiveIndex = 0

    while (positiveIndex < size && nums[positiveIndex] < 0) {
        positiveIndex++
    }

    var negativeIndex = positiveIndex - 1
    var position = 0
    val answer = IntArray(size)

    while (positiveIndex < size && negativeIndex >= 0) {
        // 1 < 0
        if (nums[negativeIndex] * nums[negativeIndex] < nums[positiveIndex] * nums[positiveIndex]) {
            answer[position] = nums[negativeIndex] * nums[negativeIndex]
            negativeIndex--
        } else {
            answer[position] = nums[positiveIndex] * nums[positiveIndex]
            positiveIndex++
        }
        position++
    }

    while (negativeIndex >= 0) {
        answer[position] = nums[negativeIndex] * nums[negativeIndex]
        position++
        negativeIndex--
    }
    while (positiveIndex < size) {
        answer[position] = nums[positiveIndex] * nums[positiveIndex]
        position++
        positiveIndex++
    }

    return answer
}
