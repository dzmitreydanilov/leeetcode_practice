package com.ddanilov.topQestions

fun main() {
    val nums = intArrayOf(2, 7, 11, 15)
    val target = 9
    println(twoSum(nums, target).joinToString(" "))
}

private fun twoSum(nums: IntArray, target: Int): IntArray {
    // key - value
    // value - index
    val map = hashMapOf<Int, Int>()

    for (i in nums.indices) {
        val diff = target - nums[i]
        if (map.containsKey(diff)) {
            return intArrayOf(i, map[diff]!!)
        }

        map[nums[i]] = i
    }
    return intArrayOf()
}
