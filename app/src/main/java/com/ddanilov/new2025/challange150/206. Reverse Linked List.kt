package com.ddanilov.new2025.challange150

import java.util.LinkedList

fun main() {
    val head = LinkedList<Int>()
    head.add(1)
    head.add(2)
    head.add(3)
    head.add(4)

    val result = reverseList(head)

    println(result)
}

/**
 * null -> 1 -> 2 -> 3 -> 4
 *         p    c
 * null <- 1
 */
private fun reverseList(head: LinkedList<Int>): Int? {
    return null
}