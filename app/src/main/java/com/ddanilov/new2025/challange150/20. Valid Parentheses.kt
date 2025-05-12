package com.ddanilov.new2025.challange150

import java.util.Stack

fun main() {
    val s = "[]]"

    val result = isValid(s)

    println(result)
}

/**
 * []]
 *
 *
 *
 */
private fun isValid(s: String): Boolean {
    val stack = Stack<Char>()

    s.forEach { char ->
        if (char == '(') {
            stack.push(')')
        } else if (char == '[') {
            stack.push(']')
        } else if (char == '{') {
            stack.push('}')
        } else if (stack.isEmpty() || stack.pop() != char) {
            return false
        }
    }

    return stack.isEmpty()
}