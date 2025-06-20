package com.ddanilov.newchallange

import java.util.Stack

fun main() {
    val s = "[(){}]"

    val result = isValid(s)

    println(result)
}

/**
 *
 */
private fun isValid(s: String): Boolean {
    val stack = Stack<Char>()
    s.forEach { parentheses ->
        if (parentheses == '(') {
            stack.push(')')
        } else if (parentheses == '[') {
            stack.push(']')
        } else if (parentheses == '{') {
            stack.push('}')
        } else if (stack.isEmpty() || stack.pop() != parentheses) {
            return false
        }
    }

    return stack.isEmpty()
}