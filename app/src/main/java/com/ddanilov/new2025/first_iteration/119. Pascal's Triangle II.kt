package com.ddanilov.new2025.first_iteration

fun main() {
    val rowIndex = 3

    getRow(rowIndex)

}

/**
 *          1
 *         1 1
 *  prev  1 2 1
 * new  1 3 3 1
 */
fun getRow(rowIndex: Int): List<Int> {
    var res = mutableListOf(1)

    for (i in 0 until rowIndex) {
        val newRow = MutableList(res.size + 1) { 0 }
        for (j in 0 until res.size) {
            newRow[j] += res[j]
            newRow[j + 1] += res[j]
        }
        res = newRow
    }

    return res
}