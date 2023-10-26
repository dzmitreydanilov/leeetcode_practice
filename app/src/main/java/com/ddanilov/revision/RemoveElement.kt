package com.ddanilov.revision

fun main() {
    val nums = intArrayOf(3, 2, 2, 3)
    val value = 3
    val result = removeElement(nums, value)

    println(result)
}

private fun removeElement(nums: IntArray, `val`: Int): Int {
    var counter = 0
    for(i in nums.indices) {
        if(nums[i] != `val`) {
            nums[counter] = nums[i]
            counter++
        }
    }
    println(nums.joinToString())
    return  counter
}
