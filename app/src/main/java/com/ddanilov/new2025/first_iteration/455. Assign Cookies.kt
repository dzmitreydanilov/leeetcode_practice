package com.ddanilov.new2025.first_iteration

fun main() {
    val g = intArrayOf(1, 2, 3)
    val s = intArrayOf(1, 1)

    val result = findContentChildren(g, s)

    println("XXX $result")
}

/**
 * 1, 2, 3
 * i
 * 1, 1
 * j
 *
 */
private fun findContentChildren(g: IntArray, s: IntArray): Int {

    var i = g.lastIndex
    var j = s.lastIndex
    var consent = 0

    while (i >= 0 && j >= 0) {
        if (s[j] >= g[i]) {
            consent++
            j--
        }
        i--
    }

    return consent
}
