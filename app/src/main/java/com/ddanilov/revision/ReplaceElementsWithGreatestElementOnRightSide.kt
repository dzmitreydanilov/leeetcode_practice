package com.ddanilov.revision

fun main() {
    val nums = intArrayOf(17, 18, 5, 4, 6, 1)
    val result = replaceElements1(nums)

    println(result.joinToString(""))
}

// TC O(n^2)
//SC O(1)
fun replaceElements(arr: IntArray): IntArray {
    for (i in arr.indices) {
        var max = 0
        for (j in i + 1 until arr.size) {
            max = maxOf(max, arr[j])
        }
        arr[i] = if (max != 0) max else -1
    }
    return arr
}


// TC O(n)
// SC O(1)
fun replaceElements1(arr: IntArray): IntArray {
    //6
    var max = -1
    for (i in arr.lastIndex downTo 0) {
        //4
        val currentValue = arr[i]
        arr[i] = max
        //i = -1
        max = maxOf(max, currentValue)
    }

    return arr
}
