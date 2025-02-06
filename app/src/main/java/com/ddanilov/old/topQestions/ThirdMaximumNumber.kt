package com.ddanilov.topQestions

fun main() {
    val nums = intArrayOf(2, 2, 3, 1)

    println(thirdMax(nums))
}

private fun thirdMax(nums: IntArray): Int {
    var first = Long.MIN_VALUE
    var second = Long.MIN_VALUE
    var third = Long.MIN_VALUE

    for (i in nums) {
        val num = i.toLong()
        if (num == first || num == second || num == third) continue

        if (num > first) {
            third = second
            second = first
            first = num
        } else if (num > second) {
            third = second
            second = num
        } else if (num > third) {
            third = num
        }
    }
    return (if (third == Long.MIN_VALUE) first else third).toInt()
}
