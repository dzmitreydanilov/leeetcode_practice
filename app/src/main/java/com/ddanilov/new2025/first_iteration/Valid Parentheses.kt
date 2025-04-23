package com.ddanilov.new2025.first_iteration

import java.util.Stack

fun main() {
    val s = "()[]{}"
    val result = isValid(s)

    println(result)
}

private fun isValid(s: String): Boolean {
    val stack = Stack<Char>()

    for (char in s) {
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
