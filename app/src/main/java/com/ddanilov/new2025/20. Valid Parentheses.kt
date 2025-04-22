package com.ddanilov.new2025

import java.util.Stack

fun main() {
    val s = "()[]{}"
    val result = isValid(s)

    println(result)
}


/**
 * ([]{}}
 *

 * s = [)]
 */
private fun isValid(s: String): Boolean {
    val stack = Stack<Char>()

    for (c in s) {
        if (c == '(') {
            stack.push(')')
        } else if (c == '[') {
            stack.push(']')
        } else if (c == '{') {
            stack.push('}')
        } else if (stack.isEmpty() || stack.pop() != c) {
            return false
        }
    }
    return stack.isEmpty()
}
