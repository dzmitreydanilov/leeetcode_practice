package com.ddanilov.newchallange

import java.util.Stack

fun main() {
    val s = "()[]{}"

    val result = isValid(s)

    print(result)
}


/**
 * ([{}])
 *
 *  ), ], }
 */
private fun isValid(s: String): Boolean {

    val stack = Stack<Char>()

    for (p in s) {
        if (p == '(') {
            stack.push(')')
        } else if (p == '[') {
            stack.push(']')
        } else if (p == '{') {
            stack.push('}')
        } else if (stack.isEmpty() || p != stack.pop()) {
            return false
        }
    }

    return stack.isEmpty()
}