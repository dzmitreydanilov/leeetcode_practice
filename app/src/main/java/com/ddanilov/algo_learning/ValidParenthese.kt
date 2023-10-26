package com.ddanilov.algo_learning

import java.util.Stack

fun main() {
    val string = "([}}])"
    val result = isValid(string)


    println(result)
}

private fun isValid(s: String): Boolean {
    if (s.length % 2 != 0) return false
    val stack = Stack<Char>()

    s.forEach { value ->
        if (value == '(' || value == '[' || value == '{') {
            stack.push(value)
        } else if (value == ')' && stack.isNotEmpty() && stack.peek() == '(') {
            stack.pop()
        } else if (value == ']' && stack.isNotEmpty() && stack.peek() == '[') {
            stack.pop()
        } else if (value == '}' && stack.isNotEmpty() && stack.peek() == '{') {
            stack.pop()
        } else {
            return false
        }
    }

    return stack.isEmpty()
}
