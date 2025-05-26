package com.ddanilov.newchallange

fun main() {
    val numRows = 5
    val triangle = generate(numRows)

    for (row in triangle) {
        println(row)
    }
}


/**
 *             1
 *           1
 *
 *
 *
 *
 */
private fun generate(numRows: Int): List<List<Int>> {
    val triangle = mutableListOf<MutableList<Int>>()
    triangle.add(mutableListOf(1))

    for (i in 0 until numRows - 1) {
        val prevRow = triangle[i]
        val currentRow = MutableList(prevRow.size + 1) { 0 }
        for (j in prevRow.indices) {
            currentRow[j] += prevRow[j]
            currentRow[j + 1] += prevRow[j]
        }

        triangle.add(currentRow)
    }

    return triangle
}