package com.ddanilov.algo_learning.arrays

// do we have any req for TC or SC?
// what is good pair?
fun main() {
    val array = intArrayOf(1, 2, 3, 1, 1, 3)
    val result = findGoodPairNumber1(array)

    println(result)
}

//TC O(n^2)
//SC O(1)
fun findGoodPairNumber(nums: IntArray): Int {
    var pairCount = 0
    for (i in nums.indices) {
        for (j in i + 1 until nums.size) {
            if (nums[i] == nums[j]) {
                pairCount++
            }
        }
    }
    return pairCount
}

//val array = intArrayOf(1, 2, 3, 1, 1, 3)

//TC O(n)
// SC O(n)
fun findGoodPairNumber1(nums: IntArray): Int {
    val map = HashMap<Int, Int>()
    var pairCount = 0
    for (item in nums) {
        if (map.contains(item)) {
            pairCount += map[item]!!
        }
        map[item] = map.getOrDefault(item, 0) + 1
    }
    return pairCount
}

