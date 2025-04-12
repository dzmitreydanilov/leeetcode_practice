package com.ddanilov.new2025

import kotlin.math.max

fun main() {
    val nums = intArrayOf(5, 2, 2)

    val result = thirdMax(nums)

    println("XXXXX $result")

}

/**
 * 2,2,3,1
 *
 * m1 = 3
 *
 * m2 = 2
 *
 * m3 = 1
 */

private fun thirdMax(nums: IntArray): Int {
    var m1: Int? = null
    var m2: Int? = null
    var m3: Int? = null

    for (num in nums) {
        if (num == m1 || num == m2 || num == m3) continue

        if (m1 == null || num > m1) {
            m3 = m2
            m2 = m1
            m1 = num
        } else if (m2 == null || num > m2) {
            m3 = m2
            m2 = num
        } else if (m3 == null || num > m3) {
            m3 = num
        }
    }

    return m3 ?: m1!!
}
