package com.ddanilov.topQestions


fun main() {
    val nums = intArrayOf(100, 4, 200, 1, 3, 2)
    println(longestConsecutive(nums))
}

private fun longestConsecutive(nums: IntArray): Int {
    var longestSequenceLength = 0
    val map = HashMap<Int, Boolean>()

    nums.forEach { num ->
        map[num] = false
    }

    for (num in nums) {
        var currentSequenceLength = 1
        var nextNum = num + 1
        while (map.contains(nextNum) && map[nextNum] == false) {
            currentSequenceLength++
            map[nextNum] = true
            nextNum++
        }
        var prevNum = num - 1
        while (map.contains(prevNum) && map[prevNum] == false) {
            currentSequenceLength++
            map[prevNum] = true
            prevNum--
        }
        longestSequenceLength = maxOf(longestSequenceLength, currentSequenceLength)
    }

    return longestSequenceLength
}
