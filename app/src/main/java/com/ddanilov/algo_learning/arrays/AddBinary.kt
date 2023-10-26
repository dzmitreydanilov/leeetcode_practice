package com.ddanilov.algo_learning.arrays

fun main() {
    val a = "1010"
    val b = "1011"
    val result = addBinary(a, b)

    println(result)
}

private fun addBinary(a: String, b: String): String {
    val stringBuilder = StringBuilder()
    var i = a.length - 1
    var j = b.length - 1
    var carry = 0

    while (i >= 0 || j >= 0) {
        var sum = carry

        if (i >= 0) {
            sum += a[i] - '0'
            println("a[i]: ${a[i]}")
            println("${a[i]} - 0: ${a[i] - '0'}")
            println("sum $sum")
        }

        if (j >= 0) {
            sum += b[j] - '0'
            println("b[j]: ${b[j]}")
            println("${b[j]} - 0: ${b[j] - '0'}")
            println("sum $sum")
        }

        stringBuilder.append(sum % 2)

        println("sum % 2: ${sum % 2}")
        sum /= 2
        println("sum / 2 ${sum / 2}")
        i--
        j--
        println("sum $sum")
        println("--------")
    }
    println(stringBuilder)
    return stringBuilder.reverse().toString()
}
