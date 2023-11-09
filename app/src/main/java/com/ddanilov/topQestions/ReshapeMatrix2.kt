package com.ddanilov.topQestions

fun main() {
    val mat = arrayOf(
        intArrayOf(1, 2),
        intArrayOf(3, 4)
    )
    println(matrixReshape(mat, 1, 4).joinToString(" "))
}

private fun matrixReshape(mat: Array<IntArray>, r: Int, c: Int): Array<IntArray> {
    val rowLen = mat.size
    val columnLen = mat[0].size

    if ((rowLen * columnLen) != (r * c)) return mat

    val answer = Array(r) { IntArray(c) }

    var rowNum = 0
    var colNum = 0

    for (i in mat.indices) {
        for (j in mat[i].indices) {
            answer[rowNum][colNum] = mat[i][j]
            colNum++

            if (colNum == c) {
                colNum = 0
                rowNum++
            }
        }
    }

    return answer
}
