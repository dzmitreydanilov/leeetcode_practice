package com.ddanilov.new2025

fun main() {
    val array1 = mutableListOf<Int>(1, 2, 4, 6)
    val array2 = mutableListOf(2)

    val result = mergeArrays(array1, array2)

    println("Merge result: ${result.toTypedArray().contentToString()}")
}

private fun mergeArrays(array1: MutableList<Int>, array2: MutableList<Int>): List<Int> {
    if (array1.isEmpty()) return array2
    if (array2.isEmpty()) return array1

    val mergedArray = mutableListOf<Int>()
    var array1ItemIndex = 0
    var array2ItemIndex = 0

    while (array2ItemIndex < array2.size && array1ItemIndex < array1.size) {
        val a1Item = array1[array1ItemIndex]
        val a2Item = array2[array2ItemIndex]
        if (a1Item < a2Item) {
            mergedArray.add(a1Item)
            array1ItemIndex++
        } else {
            mergedArray.add(a2Item)
            array2ItemIndex++
        }
    }

    while (array2ItemIndex < array2.size) {
        mergedArray.add(array2[array2ItemIndex])
        array2ItemIndex++
    }

    while (array1ItemIndex < array1.size) {
        mergedArray.add(array1[array1ItemIndex])
        array1ItemIndex++
    }

    return mergedArray
}
