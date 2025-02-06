package com.ddanilov.topQestions

fun main() {
    val image = arrayOf(
        intArrayOf(1, 1, 1),
        intArrayOf(1, 1, 0),
        intArrayOf(1, 0, 1),
    )
    val sr = 1
    var sc = 1
    val color = 2
}

private fun floodFill(image: Array<IntArray>, sr: Int, sc: Int, color: Int): Array<IntArray> {
    if (image[sr][sc] == color) return image
    fill(image, sr, sc, image[sr][sc], color)
    return image
}

private fun fill(image: Array<IntArray>, sr: Int, sc: Int, color: Int, newColor: Int) {
    if (sr < 0 || sc < 0 || sr >= image.size || sc >= image[0].size || image[sr][sc] != color) {
        return
    }

    image[sr][sc] = newColor

    fill(image, sr + 1, sc, color, newColor)
    fill(image, sr - 1, sc, color, newColor)
    fill(image, sr, sc + 1, color, newColor)
    fill(image, sr, sc - 1, color, newColor)
}
