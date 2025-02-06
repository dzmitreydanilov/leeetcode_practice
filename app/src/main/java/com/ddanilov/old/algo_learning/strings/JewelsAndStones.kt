package com.ddanilov.algo_learning.strings

fun main() {
    val jewels = "aA"
    val stones = "aAAbbbb"
    val result = numJewelsInStones1(jewels, stones)

    println(result)
}

// TC O(n^2)
// SC O(1)
private fun numJewelsInStones(jewels: String, stones: String): Int {
    var count = 0
    for (i in jewels.indices) {
        for (j in stones.indices) {
            if (jewels[i] == stones[j]) {
                count++
            }
        }
    }
    return count
}

// TC O(n)
// SC O(n)
private fun numJewelsInStones1(jewels: String, stones: String): Int {
    var count = 0
    val set = jewels.toHashSet()
    stones.forEach {
        // Element lookup O(1)
        if (set.contains(it)) {
            count++
        }
    }

    return count
}
