package com.ddanilov.cadence2.arrays

fun main() {
    val x = 1410110141

    val result = isPalindrome(x)

    println(result)
}

/**
 *
 */
private fun isPalindrome(x: Int): Boolean {
    if (x < 0) return false
    var div = 1

    // div = 100
    // 121 >= 10*100 (1000)
    var currentNum = x
    while (x / div >= 10) {
        div *= 10
    }

    while (currentNum != 0) {
        /**
         * 122 1 % 10 = 1
         * 2 2 % 10 = 2
         */
        val right = currentNum % 10

        /**
         * 1 221 % 1000 = 1
         * 2 2 % 10 = 2
         */
        val left = currentNum / div

        if (right != left) return false

        /**
         * 1 221 % 1000 = 221
         * 221 / 10 = 22
         * 22 % 10 = 2 -> 2 /10 = 0
         *
         */
        currentNum = (currentNum % div) / 10

        /**
         * 1000 / 100 = 10
         * 10 / 100 = 0
         */
        div /= 100
    }

    return true
}