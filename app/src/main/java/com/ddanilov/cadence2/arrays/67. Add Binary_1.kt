package com.ddanilov.cadence2.arrays

fun main() {
    val a = "0"
    val b = "0"
    val result = addBinary(a, b)

    println(result)
}

private fun addBinary(a: String, b: String): String {
    val reversedA = a.reversed()
    val reversedB = b.reversed()

    var carry = 0
    var result = ""

    for (i in 0..maxOf(a.length, b.length)) {
        val digitA = if (i < a.length) reversedA[i].code - '0'.code else 0
        val digitB = if (i < b.length) reversedB[i].code - '0'.code else 0


        val total = digitA + digitB + carry
        val newChar = total % 2
        result = newChar.toString() + result
        carry = total / 2
    }

    return if (carry == 1) "1$result" else result
}