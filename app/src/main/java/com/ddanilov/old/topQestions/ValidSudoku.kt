package com.ddanilov.topQestions

fun isValidSudoku(board: Array<CharArray>): Boolean {
    val columns = mutableListOf<MutableSet<Char>>()
    val rows = mutableListOf<MutableSet<Char>>()
    val boxes = mutableListOf<MutableSet<Char>>()

    board.forEach { _ ->
        columns.add(mutableSetOf())
        rows.add(mutableSetOf())
        boxes.add(mutableSetOf())
    }

    for (i in board.indices) {
        for (j in board[i].indices) {
            val cell = board[i][j]
            if (cell == '.') continue
            val boxIndex = 3 * (i / 3) + (j / 3)
            if(rows[i].contains(cell) || columns[i].contains(cell) || boxes[boxIndex].contains(cell)) {
                return false
            }

            columns[i].add(cell)
            rows[i].add(cell)
            boxes[boxIndex].add(cell)
        }
    }
    return true
}
