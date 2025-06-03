package com.ddanilov.newchallange

fun main() {
    val a = "11"
    val b = "1"
    val result = addBinary(a, b)
}

private fun addBinary(a: String, b: String): String {

    var result = ""
    var carry = 0

    for (i in maxOf(a.length, b.length) - 1 downTo 0) {
        val digitA = if (i < a.length) a[i].code - '0'.code else 0
        val digitB = if (i < b.length) b[i].code - '0'.code else 0

        val total = digitA + digitB + carry
        val newChar = total % 2
        result = newChar.toString() + result
        carry = total / 2
    }

    return if (carry == 1) "1$result" else result
}