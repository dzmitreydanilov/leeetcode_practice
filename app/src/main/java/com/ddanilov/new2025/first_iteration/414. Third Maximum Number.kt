package com.ddanilov.new2025.first_iteration

fun main() {

    val nums = intArrayOf(2, 2, 3, 1)

    val result = thirdMax(nums)

    println(result)

}

/**
 * 2, 2, 3, 1
 *
 * m = 3
 * m2 = 2
 * m3 = 1
 */
private fun thirdMax(nums: IntArray): Int {

    var max: Int? = null
    var max2: Int? = null
    var max3: Int? = null

    for (num in nums) {

        if (num == max || num == max2 || num == max3) continue

        if (max == null || num > max) {
            max3 = max2
            max2 = max
            max = num
        } else if (max2 == null || num > max2) {
            max3 = max2
            max2 = num
        } else if (max3 == null || num > max3) {
            max3 = num
        }
    }

    return max3 ?: max!!
}
