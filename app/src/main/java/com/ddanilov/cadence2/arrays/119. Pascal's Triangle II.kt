package com.ddanilov.cadence2.arrays

fun main() {
    val rowIndex = 3

    val result = getRow(rowIndex)

    result.forEach { row ->
        println(row)
    }
}

private fun getRow(rowIndex: Int): List<Int> {
    val triangle = mutableListOf<MutableList<Int>>()
    val firstRow = mutableListOf(1)
    triangle.add(firstRow)

    for (i in 0..rowIndex - 1) {
        val prevRow = triangle[i]
        val newRow = MutableList<Int>(prevRow.size + 1) { 0 }

        for (j in prevRow.indices) {
            newRow[j] += prevRow[j]
            newRow[j + 1] += prevRow[j]
        }

        triangle.add(newRow)
    }

    return triangle.last()
}