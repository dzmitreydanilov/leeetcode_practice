package com.ddanilov.topQestions

import java.util.Arrays

fun main() {
    val grid = intArrayOf(1, 2, 3)
    val cookieSize = intArrayOf(1, 1)

    println(findContentChildren(grid, cookieSize))
}

private fun findContentChildren(g: IntArray, s: IntArray): Int {
    Arrays.sort(g)
    Arrays.sort(s)
    var contentChildren = 0
    var i = g.lastIndex
    var j = s.lastIndex

    while (i >= 0 && j >= 0) {
        if (s[j] >= g[i]) {
            i--
            j--
            contentChildren++
        } else {
            i--
        }
    }

    return contentChildren
}
