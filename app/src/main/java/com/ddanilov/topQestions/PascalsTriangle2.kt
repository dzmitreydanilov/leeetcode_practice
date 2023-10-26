package com.ddanilov.topQestions

fun main() {
    val rowIndex = 3

    println(getRow(rowIndex).joinToString(" "))
}

private fun getRow(rowIndex: Int): List<Int> {
    val triangle = mutableListOf<MutableList<Int>>()
    val firstRow = mutableListOf<Int>()
    firstRow.add(1)
    if(rowIndex == 0) return firstRow
    triangle.add(firstRow)

    for (i in 1.. rowIndex) {
        val prevRow = triangle[i - 1]
        val currentRow = mutableListOf<Int>()
        currentRow.add(1)
        for (j in 1 until i) {
            currentRow.add(prevRow[j] + prevRow[j - 1])
        }
        currentRow.add(1)

        triangle.add(currentRow)
        if (i == rowIndex) {
            return currentRow
        }
    }
    return listOf()
}
