package com.ddanilov.topQestions

fun main() {
    val arr = intArrayOf(17, 18, 5, 4, 6, 1)
    println(replaceElements(arr).joinToString(" "))
}

private fun replaceElements(arr: IntArray): IntArray {
    var max = -1

    for(i in arr.lastIndex downTo 0) {
        val currentValue = arr[i]
        arr[i] = max
        max = maxOf(currentValue, max)
    }

    return arr
}
