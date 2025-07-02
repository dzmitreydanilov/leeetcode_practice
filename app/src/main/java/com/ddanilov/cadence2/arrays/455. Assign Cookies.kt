package com.ddanilov.cadence2.arrays

import java.util.Arrays

fun main() {
    val g = intArrayOf(2, 3, 2)
    val s = intArrayOf(1, 2, 3)

    val result = findContentChildren(g, s)

    println(result)
}

/**
 * g = 1, 2
 *    i
 * s = 1, 2, 3
 *     j
 */
private fun findContentChildren(g: IntArray, s: IntArray): Int {
    Arrays.sort(g)
    Arrays.sort(s)

    var i = g.lastIndex
    var j = s.lastIndex
    var answer = 0

    while (i >= 0 && j >= 0) {
        if (s[j] >= g[i]) {
            answer++
            i--
            j--
        } else if (s[j] < g[i]) {
            i--
        } else {
            j--
        }
    }

    return answer
}