package com.ddanilov.revision

fun main() {
    val nums = intArrayOf(3, 2, 3)
    val res = majorityElement(nums)

    println(res)
}

private fun majorityElement(nums: IntArray): Int {
    var majorElement = 0
    var counter = 0

    nums.forEach {
        if (counter == 0) {
            majorElement = it
        }

        if (majorElement == it) {
            counter++
        } else {
            counter--
        }
    }

    return majorElement
}
