package com.ddanilov.algo_learning.arrays

fun main() {
    val array = intArrayOf(0, 1, 2, 3, 4)
    val target = 2
    val result = numberOfEmployeesWhoMetTarget(array, target)

    println(result)
}

// TC O(n)
// SC O(1)
private fun numberOfEmployeesWhoMetTarget(hours: IntArray, target: Int): Int {
    var employeesCount = 0
    hours.forEach {
        if (it >= target) employeesCount++
    }

    return employeesCount
}
