package com.ddanilov.topQestions

fun main() {
    val nums = intArrayOf(3, 2, 3)
    println(majorityElement(nums))
}

private fun majorityElement(nums: IntArray): Int {
    var counter = 0
    var item = 0

    for (num in nums) {
        if(counter == 0) {
            item = num
        }
        if(item == num) {
            counter++
        } else {
            counter--
        }
    }

    return item
}
