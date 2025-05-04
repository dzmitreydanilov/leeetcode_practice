package com.ddanilov.new2025.repeate

fun main() {
    val s = "leetcode"
    val k = 2

    val result = getLucky(s, k)

    println(result)
}


/**
 *
 */
private fun getLucky(s: String, k: Int): Int {
    var digitSum = 0

    s.forEach {
        val charIntValue = it - 'a' + 1
        digitSum += charIntValue / 10 + charIntValue % 10
    }


    //123
    repeat(k - 1) {
        var newSum = 0
        while (digitSum > 0) {

            //3+2+1
            newSum += digitSum % 10
            //0
            digitSum /= 10
        }
        digitSum = newSum
    }
    return digitSum
}