package com.ddanilov.newchallange

fun main() {
    val s = "leetcode"
    val k = 2

    val result = getLucky(s, k)

    print(result)
}

private fun getLucky(s: String, k: Int): Int {
    var digitSum = 0

    s.forEach {
        val char = it - 'a' + 1
        digitSum += char / 10 + char % 10
    }

    // 36
    repeat(k - 1) {
        var newSum = 0
        while (digitSum > 0) {
            newSum += digitSum % 10
            digitSum = digitSum / 10
        }

        digitSum = newSum
    }

    return digitSum
}