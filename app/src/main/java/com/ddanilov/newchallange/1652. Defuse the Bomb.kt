package com.ddanilov.newchallange

import kotlin.math.abs

fun main() {
    val code = intArrayOf(2,4,9,3)
    val k = -2

    val result = decrypt2(code, k)
    result.forEach {
        println(it)
    }
}

/**
 * k = -2
 *
 * 5, 7, 1, 4
 * i
 *          j
 */
private fun decrypt1(code: IntArray, k: Int): IntArray {
    val n = code.size
    val answer = IntArray(code.size)

    if (k == 0) return answer

    for (i in code.indices) {
        if (k > 0) {
            for (j in i + 1..i + k) {
                answer[i] += code[j % n]
            }
        } else if (k < 0) {
            for (j in i - 1 downTo i - abs(k)) {
                val index = j.mod(n)
                answer[i] += code[index]
            }
        }


    }

    return answer
}

/**
 * 0, 1, 2, 3, 4, 5,
 *
 * 2, 4, 9, 3,  ,  ,
 *             L
 *                R
 *
 * currSum = 2+4
 * k = 2
 *
 * [13, 12, 5, 6]
 */
private fun decrypt2(code: IntArray, k: Int): IntArray {
    val n = code.size
    val answer = IntArray(code.size)

    var l = 0
    var currSum = 0
    for (r in 0 until n + abs(k)) {
        currSum += code[r.mod(n)]

        if (r - l + 1 > abs(k)) {
            currSum -= code[l.mod(n)]
            l = (l + 1).mod(n)
        }

        if (r - l + 1 == abs(k)) {
            if (k > 0) {
                answer[(l - 1).mod(n)] = currSum
            } else if (k < 0) {
                answer[(r + 1).mod(n)] = currSum
            }
        }
    }
    return answer
}