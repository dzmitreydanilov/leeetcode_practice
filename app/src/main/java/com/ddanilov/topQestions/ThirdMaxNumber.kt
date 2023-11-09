package com.ddanilov.topQestions

fun main() {
    val nums = intArrayOf(1, 2, 2, 5, 3, 5)

    println(thirdMax(nums))
}

private fun thirdMax(nums: IntArray): Int {
    var first = Long.MIN_VALUE // 5
    var second = Long.MIN_VALUE // 3
    var third = Long.MIN_VALUE // 2

    for (num in nums) {
        val item = num.toLong()
        if (first == item || second == item || third == item) continue

        if (num > first) {
            third = second
            second = first
            first = item
        } else if (num > second) {
            third = second
            second = item
        } else if (num > third) {
            third = item
        }
    }

    return (if (third == Long.MIN_VALUE) return first.toInt() else third).toInt()
}
