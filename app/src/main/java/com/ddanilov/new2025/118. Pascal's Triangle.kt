package com.ddanilov.new2025

fun main() {
    val numRows = 5

    val result = generate(numRows)
}


/**
 *             1
 *           1   1
 *         1   2   1
 *       1   3   3   1
 *     1   4   6   4   1
 *
 *
 *
 */
private fun generate(numRows: Int): List<List<Int>> {
    val rows = mutableListOf<List<Int>>(listOf(1))

    for (i in 0 until numRows - 1) {
        val prevRow = rows.last()
        val newRow = MutableList(prevRow.size + 1) { 0 }
        for (j in prevRow.indices) {
            newRow[j] += prevRow[j]
            newRow[j + 1] += prevRow[j]
        }

        rows.add(newRow)
    }

    return rows
}

