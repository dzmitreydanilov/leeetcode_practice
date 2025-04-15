package com.ddanilov.new2025

fun main() {
    val rows = 5
    val result = generate(rows)


    result.forEach {
        it.toString()
    }
}

/**
 *        1
 *
 *
 *
 */

private fun generate(numRows: Int): List<List<Int>> {

    val triangle = mutableListOf<List<Int>>(listOf(1))

    for (i in 0 until numRows - 1) {
        val prevRow = triangle.last()
        val newRow = MutableList(prevRow.size + 1) { 0 }

        for (j in prevRow.indices) {
            newRow[j] += prevRow[j]
            newRow[j + 1] += prevRow[j]
        }

        triangle.add(newRow)
    }

    return triangle
}
