package com.ddanilov.topQestions

fun main() {
    val num = intArrayOf(1, 2, 3)
    println(plusOne(num).joinToString(" "))
}

//1, 2, 9
//9 9 9
private fun plusOne(digits: IntArray): IntArray {
    for (i in digits.lastIndex downTo 0) {
        if (digits[i] < 9) {
            digits[i] = digits[i] + 1
            return digits
        }
        digits[i] = 0
    }
    val answer = IntArray(digits.size + 1)
    answer[0] = 1
    return answer
}
