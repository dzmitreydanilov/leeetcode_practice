package com.ddanilov.algo_learning.arrays

// as a result we have to get array1 + array2
// do we have any time or space complexity requirements
fun main() {
    // are they sorted?
    val array1 = intArrayOf(2, 1, 10, 11, 24)
    val array2 = intArrayOf(3, 14, 35, 6, 15)
    val sortedArray1 = array1.sortedArray()
    val sortedArray2 = array2.sortedArray()
    val mergeResult = mergeTwoArrays(sortedArray1, sortedArray2)

    println(mergeResult.joinToString(" "))
}

// O(n)
// O(n)
private fun mergeTwoArrays(array1: IntArray, array2: IntArray): List<Int> {
    val mergeResult = mutableListOf<Int>()

    var i = 0
    var j = 0

    while (i < array1.size && j < array2.size) {
        if (array1[i] < array2[j]) {
            mergeResult.add(array1[i++])
        } else {
            mergeResult.add(array2[j++])
        }
    }

    while (i < array1.size) {
        mergeResult.add(array1[i++])
    }

    while (j < array2.size) {
        mergeResult.add(array2[j++])
    }

    return mergeResult
}
