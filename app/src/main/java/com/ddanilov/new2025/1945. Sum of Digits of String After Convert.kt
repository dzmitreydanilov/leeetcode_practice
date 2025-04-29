package com.ddanilov.new2025

fun main() {
    val s = "leetcodedaksjdaddffasdasdasd"
    val k = 3

    val result = getLucky(s, k)

    println(result)
}


/**
 * 9999
 * 0 + 9 x4
 *
 * 36
 *
 *
 *
 *
 */
private fun getLucky(s: String, k: Int): Int {
    var digitSum = 0

    s.forEach { char ->
        val charValue = char - 'a' + 1
        digitSum += charValue / 10 + charValue % 10
    }

    /**
     * 121
     */
    repeat(k - 1) {
        //
        var newSum = 0
        while (digitSum > 0) {
            // 1 + 2 + 1
            newSum += digitSum % 10
            // 0
            digitSum /= 10
        }
        // 4
        digitSum = newSum
    }


    return digitSum
}