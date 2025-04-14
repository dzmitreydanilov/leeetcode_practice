package com.ddanilov.new2025.repeate

import java.util.Arrays

fun main() {
    val g = intArrayOf(1, 2, 3)
    val s = intArrayOf(1, 1)

    val result = findContentChildren(g, s)

    println("XXXX $result")
}


/**
 * 7, 8, 9, 10
 *           i
 * 5, 6, 7, 8
 *          j
 */

private fun findContentChildren(g: IntArray, s: IntArray): Int {
    Arrays.sort(g)
    Arrays.sort(s)

    var i = g.lastIndex
    var j = s.lastIndex
    var result = 0

    while (i >= 0 && j >= 0) {
        if (s[j] >= g[i]) {
            result++
            j--
        }
        i--
    }

    return result
}
