package com.ddanilov.revision

fun main() {

}

private fun twoSum(nums: IntArray, target: Int): IntArray {
    val map = HashMap<Int, Int>()

    for (i in nums.indices) {
        val diff = target - nums[i]
        if(map.contains(diff)) {
            return intArrayOf(i, map[diff]!!)
        }

        map[nums[i]] = i
    }

    return intArrayOf()
}
