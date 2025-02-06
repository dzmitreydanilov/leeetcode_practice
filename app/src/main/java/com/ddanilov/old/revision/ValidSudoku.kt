package com.ddanilov.revision

fun main() {
    val set = hashSetOf<Int>()
}

private fun isValidSudoku(board: Array<CharArray>): Boolean {
    val columns = mutableListOf<MutableSet<Char>>()
    val rows = mutableListOf<MutableSet<Char>>()
    val boxes = mutableListOf<MutableSet<Char>>()

    for (i in board.indices) {
        columns.add(mutableSetOf())
        rows.add(mutableSetOf())
        boxes.add(mutableSetOf())
    }

    for (i in board.indices) {
        for (j in board[i].indices) {
            val cell = board[i][j]
            if (cell == '.') continue
            val boxNum = 3 * (i / 3) + (j / 3)
            if (rows[i].contains(cell) || columns[j].contains(cell) || boxes[boxNum].contains(cell)) {
                return false
            }
            rows[i].add(cell)
            columns[j].add(cell)
            boxes[boxNum].add(cell)
        }
    }

    return true
}
