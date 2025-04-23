package com.ddanilov.new2025.first_iteration

fun main() {

    val nums = intArrayOf(3, 2, 1)

    val result = thirdMax(nums)

    println("XX $result")

}

/**
 * 3,2,1
 * 3
 * m = 3
 * m2 = 0
 * m3 = 0
 */
private fun thirdMax(nums: IntArray): Int {
    var m: Int? = null
    var m2: Int? = null
    var m3: Int? = null

    for (num in nums) {

        if (m == num || m2 == num || m3 == num) continue

        if (m == null || num > m) {
            m3 = m2
            m2 = m
            m = num
        } else if (m2 == null || num > m2) {
            m3 = m2
            m2 = num
        } else if (m3 == null || num > m3) {
            m3 = num
        }
    }

    return m3 ?: m!!
}