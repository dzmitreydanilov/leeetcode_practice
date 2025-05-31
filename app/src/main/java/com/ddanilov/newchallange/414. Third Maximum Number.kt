package com.ddanilov.newchallange


fun main() {

    val nums = intArrayOf(2,2,3,1)

    val result = thirdMax(nums)

    println(result)
}

/**
 * 3, 2, 1
 */
private fun thirdMax(nums: IntArray): Int {
    var f: Int? = null
    var s: Int? = null
    var t: Int? = null

    for (num in nums) {

        if (num == s || num == f || num == t) continue
        if (f == null || num > f) {
            t = s
            s = f
            f = num
        } else if (s == null || num > s) {
            t = s
            s = num
        } else if (t == null || num > t) {
            t = num
        }
    }

    return t ?: f ?: 0
}