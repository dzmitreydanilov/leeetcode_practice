package com.ddanilov.algo_learning.arrays

fun main() {
    val list1 = intArrayOf(1, 2, 4)
    val list2 = intArrayOf(1, 3, 4)
    val result = mergeTwoLists(list1, list2)

    println(result.joinToString(""))

}

fun mergeTwoLists(list1: IntArray, list2: IntArray): IntArray {
    var i = 0
    var j = 0
    val result = mutableListOf<Int>()
    while (i < list1.size && j < list2.size) {
        if (list1[i] < list2[j]) {
            result.add(list1[i++])
        } else {
            result.add(list2[j++])
        }
    }

    while (i < list1.size) {
        result.add(list1[i++])
    }
    while (j < list2.size) {
        result.add(list1[j++])
    }

    return result.toIntArray()
}
