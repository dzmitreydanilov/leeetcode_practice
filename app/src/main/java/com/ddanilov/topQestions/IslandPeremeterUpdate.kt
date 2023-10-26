package com.ddanilov.topQestions


fun main() {
    val grid = arrayOf<IntArray>(
        intArrayOf(0, 1, 0, 0),
        intArrayOf(1, 1, 1, 0),
        intArrayOf(0, 1, 0, 0),
        intArrayOf(1, 1, 0, 0)
    )

    println(islandPerimeter(grid))
}

private fun islandPerimeter(grid: Array<IntArray>): Int {
    var answer = 0

    for (i in grid.indices) {
        for (j in grid[i].indices) {
            if (grid[i][j] == 1) {
                answer += 4
                if (i > 0 && grid[i - 1][j] == 1) {
                    answer -= 2
                }

                if (j > 0 && grid[i][j - 1] == 1) {
                    answer -= 2
                }
            }
        }
    }

    return answer
}
