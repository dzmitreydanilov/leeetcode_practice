package com.ddanilov.topQestions

import kotlinx.coroutines.channels.ticker

fun main() {
    val numsRows = 6

    generate(numsRows)

}

private fun generate(numRows: Int): List<List<Int>> {
    val triangle = mutableListOf<MutableList<Int>>()
    if (numRows == 0) return triangle
    val firstRow = mutableListOf<Int>()
    firstRow.add(1)
    triangle.add(firstRow)

    for(i in 1 until numRows) {
        val prevRow = triangle[i - 1]
        val row = mutableListOf<Int>()
        row.add(1)

        for(j in 1 until i) {
            row.add(prevRow[j] + prevRow[j - 1])
        }

        row.add(1)
        triangle.add(row)
    }

    return triangle
}
