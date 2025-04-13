package com.ddanilov.new2025

import java.util.Arrays

fun main() {
    val gridFactor = intArrayOf(1, 2, 3)
    val cookies = intArrayOf(1, 1)


    val result = findContentChildren(gridFactor, cookies)

    println("XX $result")
}

/**
 * 1,2,3
 *     i
 * 1,1
 *   j
 *
 * r = 0
 */


private fun findContentChildren(g: IntArray, s: IntArray): Int {
    Arrays.sort(g)
    Arrays.sort(s)

    var p1 = g.size - 1
    var p2 = s.size - 1
    var result = 0

    while (p1 >= 0 && p2 >= 0) {
        if (s[p1] >= g[p2]) {
            result++
            --p2
        }
        --p1
    }

    return result
}
