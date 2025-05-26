package com.ddanilov.newchallange


fun main() {
    val rowIndex = 3

    val result = getRow(rowIndex)

    result.forEach {
        println(it)
    }
}

private fun getRow(rowIndex: Int): List<Int> {
    val trangle = mutableListOf<MutableList<Int>>()
    trangle.add(mutableListOf(1))

    for (i in 0 until rowIndex) {
        val prevRow = trangle[i]
        val newRow = MutableList(prevRow.size + 1) { 0 }
        for (j in prevRow.indices) {
            newRow[j] += prevRow[j]
            newRow[j + 1] += prevRow[j]
        }
        trangle.add(newRow)
    }
    return trangle[rowIndex]
}