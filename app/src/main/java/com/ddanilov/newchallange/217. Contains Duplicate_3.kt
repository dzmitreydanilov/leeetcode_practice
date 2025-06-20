package com.ddanilov.newchallange

fun main() {
    val nums = intArrayOf(1, 1, 1, 3, 3, 4, 3, 2, 4, 2)
    val result = containsDuplicate(nums)

    print(result)
}

/**
 * 1, 1, 1, 3, 3, 4, 3, 2, 4, 2
 */
private fun containsDuplicate(nums: IntArray): Boolean {
    val seen = mutableSetOf<Int>()

    for(num in nums) {
        if(seen.contains(num)){
            return true
        } else {
            seen.add(num)
        }
    }

    return false
}