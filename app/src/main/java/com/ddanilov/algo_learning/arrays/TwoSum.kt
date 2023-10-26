package com.ddanilov.algo_learning.arrays

//fun com.ddanilov.revision.main() {
//    val array = intArrayOf(1, 6, 4, 2, 18, 32)
//    val target = 19
//    val result = twoSum1(array, target)
//    println(result.joinToString())
//}
//
//// brute-force
//// O(n^2)
//// space complexity O(1)
//private fun twoSum(array: IntArray, target: Int): IntArray {
//    for (i in array.indices) {
//        for (j in i + 1 until array.size) {
//            if (array[i] + array[j] == target) {
//                return intArrayOf(i, j)
//            }
//        }
//    }
//    return intArrayOf()
//}
//
//// map
//// for loop
//// on each iteration diff = targe - array[i]
//// map.contains(diff)
//// T.C - O(n)
//// S.C - O(n)
//private fun twoSum1(array: IntArray, target: Int): IntArray {
//    val map = HashMap<Int, Int>()
//
//    for (i in array.indices) {
//        val diff = target - array[i]
//        if (map.contains(diff)) {
//            return intArrayOf(i, map[diff]!!)
//        }
//
//        map[array[i]] = i
//    }
//
//    return intArrayOf()
//}
fun main() {
    val array = intArrayOf(2, 7, 11, 15)
    val target = 9
    val result = twoSum3(array, target)

    println(result.joinToString(""))
}

// TC O(n ^2)
// SC O(n)
private fun twoSum3(nums: IntArray, target: Int): IntArray {
    val result = IntArray(2)
    for (i in nums.indices) {
        for (j in i + 1 until nums.size) {
            if (nums[i] + nums[j] == target) {
                result[0] = i
                result[1] = j
            }
        }
    }

    return result
}

// TC O(n)
// SC O(n)
private fun twoSum4(nums: IntArray, target: Int): IntArray {
    val map = HashMap<Int, Int>()
    for (i in nums.indices) {
        val diff = target - nums[i]
        if (map.contains(diff)) {
            return intArrayOf(i, map[diff]!!)
        }

        map[nums[i]] = i
    }

    return intArrayOf()
}


































