package com.ddanilov.topQestions

import java.util.Stack

fun main() {
    val s = "()[]{}"
    println(isValid(s))
}

private fun isValid(s: String): Boolean {
    if (s.length % 2 != 0) return false
    val stack = Stack<Char>()
    s.forEach { bracket ->
        if (bracket == '{' || bracket == '(' || bracket == '[') {
            stack.push(bracket)
        } else if (bracket == '}' && stack.isNotEmpty() && stack.peek() == '{') {
            stack.pop()
        } else if (bracket == ')' && stack.isNotEmpty() && stack.peek() == '(') {
            stack.pop()
        } else if (bracket == ']' && stack.isNotEmpty() && stack.peek() == '[') {
            stack.pop()
        } else return false
    }

    return stack.isEmpty()
}
