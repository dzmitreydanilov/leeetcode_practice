package com.ddanilov.new2025

import java.util.Arrays

fun main() {
    val g = intArrayOf(1, 2, 3)
    val s = intArrayOf(1, 1)

    val result = findContentChildren(g, s)
    println(result)
}


/**
 *  1,2,3
 * r
 *  1,1
 *    l
 *
 */
private fun findContentChildren(g: IntArray, s: IntArray): Int {
    Arrays.sort(g)
    Arrays.sort(s)

    var i = g.lastIndex
    var j = s.lastIndex

    var consent = 0

    while (i >= 0 && j >= 0) {
        if (s[j] >= g[i]) {
            consent++
            i--
            j--
        } else {
            i--
        }
    }

    return consent
}