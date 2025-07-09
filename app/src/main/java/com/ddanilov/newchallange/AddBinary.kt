package com.ddanilov.newchallange

fun main() {
    val a = "110100"
    val b = "1"

    val result = addBinary(a, b)

    println(result)
}


/**
 * 110100
 *      1
 * 1
 */
private fun addBinary(a: String, b: String): String {
    val reverseddA = a.reversed()
    val reversedB = b.reversed()

    var result = ""
    var carry = 0

    for (i in 0 until maxOf(a.length, b.length)) {
        val digitA = if (i < a.length) reverseddA[i].code - '0'.code else 0
        val digitB = if (i < b.length) reversedB[i].code - '0'.code else 0

        //              0        0   +  0
        val newSum = digitA + digitB + carry
        val newChar = newSum % 2
        result = newChar.toString() + result
        carry = newSum / 2
    }

    if (carry > 0) {
        result = "$carry" + result
    }
    return result
}