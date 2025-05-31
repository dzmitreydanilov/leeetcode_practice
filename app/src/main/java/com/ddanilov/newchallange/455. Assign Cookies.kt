package com.ddanilov.newchallange

import java.util.Arrays


fun main() {
    val g = intArrayOf(1, 2, 3)
    val s = intArrayOf(1, 1)

    val result = findContentChildren(g, s)

    print(result)
}

/**
 * 1, 2, 3
 i
 *
 * 1, 1
 *  j
 */
private fun findContentChildren(g: IntArray, s: IntArray): Int {
    Arrays.sort(g)
    Arrays.sort(s)

    var count = 0

    var i = g.lastIndex
    var j = s.lastIndex

    while (j >= 0 && i >= 0) {
        if (s[j] >= g[i]) {
            count++
            i--
            j--
        } else if (s[j] < g[i]) {
            i--
        }
    }

    return count
}