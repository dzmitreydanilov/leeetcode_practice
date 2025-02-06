package com.ddanilov.topQestions

fun main() {
    val nums = intArrayOf(0, 1, 2, 4, 5, 7)
    println(summaryRanges(nums).joinToString(" "))
}


private fun summaryRanges(nums: IntArray): List<String> {
    if (nums.isEmpty()) return emptyList()
    val result = mutableListOf<String>()
    var l = 0 // 3
    var r = 1 // 3

    for (i in 1 until nums.size) {
        if (nums[i] - nums[i - 1] == 1) {
            r++
        } else {
            result.add(rangeString(nums[l], nums[r - 1]))
            l = r
            r++
        }
    }

    result.add(rangeString(nums[l], nums.last()))

    return result
}

private fun rangeString(l: Int, r: Int): String {
    return if (l == r) "$l" else "$l->$r"
}
