package com.ddanilov.new2025.first_iteration

fun main() {
    val numRows = 5

    val result = generate(numRows)

    result.forEach {
        println(it.toTypedArray().toString())
    }
}

/**
 *
 *           1
 *          1 1
 *        1  2  1
 *      1  3  3  1
 *    1  4  6  4  1
 *
 *
 *
 *
 *
 *
 *
 *
 */
private fun generate(numRows: Int): List<List<Int>> {
    val triangle = mutableListOf(listOf(1))

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