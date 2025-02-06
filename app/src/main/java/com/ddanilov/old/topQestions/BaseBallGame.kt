package com.ddanilov.topQestions

import java.util.Stack

fun main() {
    val ops = arrayOf("1", "D", "D", "D")
    println(calPoints(ops))
}

// TC O(n)
// SC O(n)
private fun calPoints(operations: Array<String>): Int {
    val scoreArray = Stack<Int>()
    for (i in operations.indices) {
        when (val value = operations[i]) {
            "+" -> {
                val size = scoreArray.size - 1
                scoreArray.add(scoreArray[size] + scoreArray[size - 1])
            }

            "D" -> {
                val size = scoreArray.size - 1
                scoreArray.add(scoreArray[size].toInt() * 2)
            }

            "C" -> scoreArray.pop()

            else -> {
                scoreArray.add(value.toInt())
            }
        }
    }
    return scoreArray.sum()
}
