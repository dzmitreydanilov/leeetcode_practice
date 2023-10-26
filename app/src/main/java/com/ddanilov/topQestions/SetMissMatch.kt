package com.ddanilov.topQestions

fun main() {
    val nums = intArrayOf(1, 1)

    println(findErrorNums(nums).joinToString(" "))
}

private fun findErrorNums(nums: IntArray): IntArray {
    val seen = HashSet<Int>()
    var duplication = 0
    for (num in nums) {
        if (seen.contains(num)) {
            duplication = num
        }

        seen.add(num)
    }
    var missed = 0

    for (i in 1..nums.size) {
        if (!seen.contains(i)) {
            missed = i
            break
        }
    }

    return intArrayOf(duplication, missed)
}
