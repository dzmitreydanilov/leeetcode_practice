package com.ddanilov.cadence2.binary

fun main() {
    val a = "1010"
    val b = "1011"

    val result = addBinary(a, b)

    print(result)
}

/**
 * 0101
 * 1101
 *
 *
 * 10101
 *
 */
private fun addBinary(a: String, b: String): String {
    var carry = 0
    var answer = ""

    for (i in maxOf(a.length, b.length) downTo 0) {
        val digitA = if (i < a.length) a[i].code - '0'.code else 0
        val digitB = if (i < b.length) b[i].code - '0'.code else 0

        //            1     1       0
        val total = digitA + digitB + carry
        val newChar = total % 2
        answer = answer  + newChar.toString()
                carry = total / 2
    }

    return if (carry > 0) "${answer}1" else answer
}
