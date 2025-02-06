package com.ddanilov.newprofile

fun main() {
    val nums = intArrayOf(2, 7, 11, 15)
    val k = 9

    println(twoSum(nums, k).joinToString(" "))
}

private fun twoSum(nums: IntArray, target: Int): IntArray {
    // key - value from num
    // value - index
    val map = HashMap<Int, Int>()

    for (i in nums.indices) {
        val diff = target - nums[i]
        if (map.containsKey(diff)) {
            return intArrayOf(map[diff]!!, i)
        }

        map[nums[i]] = i
    }

    return intArrayOf()
}
