package com.ddanilov.new2025.repeate

import java.util.Stack

fun main() {
    val s = "()"
    val result = isValid(s)

    println(result)
}

/**
 *
 */
private fun isValid(s: String): Boolean {
    val stack = Stack<Char>()

    s.forEach {
        if (it == '(') {
            stack.push(')')
        } else if (it == '[') {
            stack.push(']')
        } else if (it == '{') {
            stack.push('}')
        } else if (stack.isEmpty() || stack.pop() != it) {
            return false
        }
    }

    return stack.isEmpty()
}