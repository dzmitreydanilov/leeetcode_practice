package com.ddanilov.topQestions

fun main() {

}

private fun generate(numRows: Int): List<List<Int>> {
    val triangle = mutableListOf<List<Int>>()

    if (numRows == 0) return triangle
    val firstRow = mutableListOf<Int>()
    firstRow.add(1)
    triangle.add(firstRow)

    for (i in 1 until numRows) {
        val prevRow = triangle[i - 1]
        val currentRow = mutableListOf<Int>()
        currentRow.add(1)
        for (j in 1 until i) {
            currentRow.add(prevRow[j] + prevRow[j - 1])
        }

        currentRow.add(1)
        triangle.add(currentRow)
    }

    return triangle
}
