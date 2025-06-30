package com.ddanilov.cadence2.arrays

fun main() {
    val numRows = 5

    val result = generate(numRows)

    result.forEach { row ->
        println(row)
    }
}

/**
 *            1
 *          1   1
 *        1   2   1
 *     1    3   3   1
 *   1   4   6   4    1
 *
 */
private fun generate(numRows: Int): List<List<Int>> {
    val triangle = mutableListOf<MutableList<Int>>()
    val firstRow = mutableListOf(1)
    triangle.add(firstRow)

    for (i in 0..numRows - 2) {
        val prevRow = triangle[i]
        val newRow = MutableList(prevRow.size + 1) { 0 }

        for (j in prevRow.indices) {
            newRow[j] += prevRow[j]
            newRow[j + 1] += prevRow[j]
        }

        triangle.add(newRow)
    }

    return triangle
}