package com.ddanilov.topQestions

fun main() {
    val mat = arrayOf(
        intArrayOf(1, 2),
        intArrayOf(3, 4)
    )
    println(matrixReshape(mat, 1, 4).joinToString(" "))
}

private fun matrixReshape(mat: Array<IntArray>, r: Int, c: Int): Array<IntArray> {
    val row = mat.size
    val column = mat[0].size

    if ((row * column) != (r * c)) return mat

    val outputArray = Array(r) { IntArray(c) }

    var rowNum = 0
    var colNum = 0

    for (i in mat.indices) {
        for (j in mat[i].indices) {
            outputArray[rowNum][colNum] = mat[i][j]
            colNum++
            if (colNum == c) {
                colNum = 0
                rowNum++
            }
        }
    }

    return outputArray
}
